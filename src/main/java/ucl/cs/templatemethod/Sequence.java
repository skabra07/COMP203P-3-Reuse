package ucl.cs.templatemethod;
import java.util.Iterator;

/**
 * Created by Suyash on 24-Oct-17.
 */
public abstract class Sequence implements Iterable<Integer> {
    public abstract int term(int i);

    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return term(index++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }
}
