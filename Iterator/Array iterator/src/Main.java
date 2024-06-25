import java.util.*;

interface SpectrumIterator {

    boolean hasNext();

    double next();
}

class Spectrum {
    private static final int START = 0;
    private static final int END = 1000;
    private final double[] array;

    public Spectrum(double[] array) {
        this.array = array.clone();
    }

    public double getStep() {
        return (double) (END - START) / array.length;
    }

    public SpectrumIterator iterator() {
        return new SpectrumIteratorImpl();
    }

    private class SpectrumIteratorImpl implements SpectrumIterator {
        int index = START;

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public double next() {
            return array[index++];
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] data = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Spectrum spectrum = new Spectrum(data);
        consume(spectrum.iterator());
    }

    private static void consume(SpectrumIterator iterator) {
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