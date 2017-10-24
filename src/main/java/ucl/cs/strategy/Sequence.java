package ucl.cs.strategy;
import java.util.Iterator;

/**
 * Created by Suyash on 24-Oct-17.
 */
public class Sequence implements Iterable<Integer> {
    private SequenceInterface sequenceInterface;

    public Sequence(SequenceInterface sequenceInterface){
        this.sequenceInterface = sequenceInterface;
    }


    public Iterator<Integer> iterator() {
        return new SequenceIterator();
    }

    public int term(int i) {
        return sequenceInterface.term(i);
    }

    private class SequenceIterator implements Iterator<Integer> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return sequenceInterface.term(index++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove is not implemented");
        }
    }

}
