package rwoo.research.queue.me;

public class MeCircularQueue {
    private Integer[] data;
    private int head;
    private int tail;
    private int size;

    public MeCircularQueue(int k) {
        data = new Integer[k];
        head = -1;
        tail = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
        }
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        data[head] = null;
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return data[head];
    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return data[tail];
    }

    public boolean isEmpty() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (null != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public boolean isFull() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if(null == data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
};

