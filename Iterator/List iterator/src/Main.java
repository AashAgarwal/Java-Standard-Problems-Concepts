import java.util.*;

interface UserIterator {

    boolean hasNext();

    boolean hasPrevious();

    User next();

    User previous();
}

class User {
    private final String name;
    private boolean blocked = false;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isBlocked() {
        return blocked;
    }
}

class ChatRoom {
    private final List<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public void remove(User user) {
        users.remove(user);
    }

    public UserIterator iterator() {
        return new NonBlockedUserIterator();
    }

    private class NonBlockedUserIterator implements UserIterator {
        private int currentIndex = -1;

        @Override
        public boolean hasNext() {
            for (int i = currentIndex + 1; i < users.size(); i++) {
                if (!users.get(i).isBlocked()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean hasPrevious() {
            for (int i = currentIndex; i >= 0; i--) {
                if (!users.get(i).isBlocked()) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public User next() {
            for (int i = currentIndex + 1; i < users.size(); i++) {
                if (!users.get(i).isBlocked()) {
                    currentIndex = i;
                    return users.get(i);
                }
            }
            throw new NoSuchElementException();
        }

        @Override
        public User previous() {
            for (int i = currentIndex; i >= 0; i--) {
                if (!users.get(i).isBlocked()) {
                    currentIndex = i - 1;
                    return users.get(i);
                }
            }
            throw new NoSuchElementException();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatRoom chatRoom = new ChatRoom();
        while (scanner.hasNext()) {
            User user = new User(scanner.next());
            user.setBlocked(scanner.nextBoolean());
            chatRoom.add(user);
        }
        consume(chatRoom.iterator());
    }

    private static void consume(UserIterator iterator) {
        StringBuilder sb = new StringBuilder();
        try {
            while (iterator.hasNext()) {
                sb.append(iterator.next().getName()).append(" ");
            }
            System.out.println(sb.toString().strip());
            sb = new StringBuilder();
            while (iterator.hasPrevious()) {
                sb.append(iterator.previous().getName()).append(" ");
            }
            System.out.println(sb.toString().strip() + " done");
        } catch (RuntimeException e) {
            System.out.println("oops");
        }
    }
}