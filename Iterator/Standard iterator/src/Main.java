import java.util.*;
import java.util.stream.Collectors;

class HyperList<T> {
    private final List<T> list;

    public HyperList(List<T> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    // implement this method
    public Iterator<T> iterator() {
        return new HyperIterator();
    }

    // implement the iterator class
    class HyperIterator implements Iterator<T> {
        private int index = 0;
        private T lastElement;

        @Override
        public boolean hasNext() {
            return index < list.size() && index >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastElement = list.get(index++);
            return lastElement;
        }

        @Override
        public void remove() {
            if (lastElement == null) {
                throw new IllegalStateException();
            }
            list.remove(lastElement);
            lastElement = null;
        }
    }
}

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nxt = scanner.nextInt();
        int rem = scanner.nextInt();
        List<Integer> input = scanner.tokens()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        HyperList<Integer> list = new HyperList<>(input);
        Iterator<Integer> iterator = list.iterator();

        try {
            for (int i = 0; i < nxt; i++) {
                System.out.println(iterator.next());
            }
            for (int i = 0; i < rem; i++) {
                iterator.remove();
            }
            System.out.println(iterator.hasNext());
            iterator.forEachRemaining(System.out::println);
        } catch (NoSuchElementException e) {
            System.out.println("nse");
        } catch (IllegalStateException e) {
            System.out.println("ise");
        } catch (RuntimeException e) {
            System.out.println("oops");
        }
        System.out.println(list);
    }
}