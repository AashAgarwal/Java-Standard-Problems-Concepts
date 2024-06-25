import java.util.*;

interface ArrayIterator<T> {

    boolean hasNext();

    T next();
}

class DynamicArray<T> {
    private static final float INFLATION_FACTOR = 1.5f;

    private T[] array;
    private int size;

    public DynamicArray(int initialSize) {
        array = (T[]) new Object[initialSize];
        size = initialSize;
    }

    public void insertAt(int index, T value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Index " + index + " out of bound for length " + size);
        }
        array[index] = value;
    }

    public void append(T value) {
        if (size == array.length) {
            inflate();
        }
        array[size++] = value;
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(array[i], value)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(T value) {
        int index = indexOf(value);
        if (index == -1) {
            return;
        }
        if (size - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        array[size - 1] = null;
        size--;
    }

    public int getSize() {
        return size;
    }

    public ArrayIterator<T> iterator() {
        return new ArrayIteratorImpl();
    }

    private class ArrayIteratorImpl implements ArrayIterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return array[index++];
        }
    }

    private void inflate() {
        int newSize = array.length == 0 ? 1 : (int) Math.ceil(array.length * INFLATION_FACTOR);
        T[] inflated = (T[]) new Object[newSize];
        System.arraycopy(array, 0, inflated, 0, size);
        array = inflated;
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int inserts = scanner.nextInt();
        int appends = scanner.nextInt();
        int removes = scanner.nextInt();
        DynamicArray<Integer> array = new DynamicArray<>(size);
        for (int i = 0; i < inserts; i++) {
            array.insertAt(i, scanner.nextInt());
        }
        for (int i = 0; i < appends; i++) {
            array.append(scanner.nextInt());
        }
        for (int i = 0; i < removes; i++) {
            array.remove(scanner.nextInt());
        }
        consume(array.iterator());
    }

    private static void consume(ArrayIterator<Integer> iterator) {
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