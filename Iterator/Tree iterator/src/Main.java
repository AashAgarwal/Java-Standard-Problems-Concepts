import java.util.*;

interface TreeIterator<E> {

    boolean hasNext();

    E next();
}

class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> root;

    public void insert(T value) {
        root = insert(root, null, value);
    }

    private Node<T> insert(Node<T> node, Node<T> parent, T value) {
        if (node == null) {
            Node<T> newNode = new Node<>(value);
            newNode.parent = parent;
            return newNode;
        }

        if (node.value.compareTo(value) == 0) {
            return node;
        }

        if (node.value.compareTo(value) > 0) {
            node.leftChild = insert(node.leftChild, node, value);
        } else {
            node.rightChild = insert(node.rightChild, node, value);
        }

        return node;
    }

    public TreeIterator<T> iterator() {
        return new InOrderIterator(root);
    }

    private class InOrderIterator implements TreeIterator<T> {
        private Stack<Node<T>> stack = new Stack<>();

        public InOrderIterator(Node<T> node) {
            pushLeftChild(node);
        }

        private void pushLeftChild(Node<T> node) {
            while (node != null) {
                stack.push(node);
                node = node.leftChild;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Node<T> current = stack.pop();
            pushLeftChild(current.rightChild);
            return current.value;
        }
    }

    private static class Node<T> {
        private final T value;
        private Node<T> parent;
        private Node<T> leftChild;
        private Node<T> rightChild;

        public Node(T value) {
            this.value = value;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        while (scanner.hasNextInt()) {
            bst.insert(scanner.nextInt());
        }
        consume(bst.iterator());
    }

    private static void consume(TreeIterator<Integer> iterator) {
        StringBuilder sb = new StringBuilder();
        try {
            while (iterator.hasNext()) {
                sb.append(iterator.next()).append(" ");
            }
            System.out.println(sb.toString().strip());
        } catch (RuntimeException e) {
            System.out.println("oops");
        }
    }
}