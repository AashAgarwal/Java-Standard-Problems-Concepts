import java.util.Iterator;
import java.util.NoSuchElementException;

class Range implements Iterable<Long> {

    private long fromInclusive;
    private long toExclusive;

    public Range(long from, long to) {
        this.fromInclusive = from;
        this.toExclusive = to;
    }

    @Override
    public Iterator<Long> iterator() {
        return new RangeIterator();
    }

    private class RangeIterator implements Iterator<Long> {
        private long from = fromInclusive;

        @Override
        public boolean hasNext() {
            return from < toExclusive;
        }

        @Override
        public Long next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return from++;
        }
    }
}