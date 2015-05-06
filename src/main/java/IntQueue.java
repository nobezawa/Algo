/**
 * Created by nobesawa on 15/05/05.
 */
public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueException extends RuntimeException {
        public EmptyIntQueException() {}
    }

    public class OverFlowQueException extends RuntimeException {
        public OverFlowQueException() {}
    }

    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverFlowQueException {
        if (num >= max) {
            throw new OverFlowQueException();
        }
        que[rear++] = x;
        num++;
        if (rear == max) {
            rear = 0;
        }
        return x;
    }

    public int deque() throws EmptyIntQueException {
        if (num <= 0) {
            throw new EmptyIntQueException();
        }
        int x = que[front++];
        num--;
        if (front == max) {
            front = 0;
        }
        return x;
    }
}
