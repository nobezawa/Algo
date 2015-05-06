/**
 * Created by nobesawa on 15/05/06.
 */
public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    public class EmptyIntQueException extends RuntimeException {
        public EmptyIntQueException() {}
    }

    public class OverFlowQueException extends RuntimeException {
        public OverFlowQueException() {}
    }

    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int push(int x) throws OverFlowQueException {
        if (ptr >= max) {
            throw new OverFlowQueException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntQueException {
        if (ptr <= 0) {
            throw new EmptyIntQueException();
        }
        return stk[ptr--];
    }

    public void clear() {
        ptr = 0;
    }
}
