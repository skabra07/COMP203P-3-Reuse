package ucl.cs.strategy;

public class TriangleNumberSequence implements SequenceInterface {

    public int term(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Not defined for indices < 0");
        }
        if (i < 1) {
            return 1;
        }
        return ((i+1)*(i+2))/2;
    }
}
