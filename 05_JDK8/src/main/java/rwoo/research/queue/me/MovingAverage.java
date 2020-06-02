package rwoo.research.queue.me;

import java.util.ArrayList;

public class MovingAverage {
    /**
     * Initialize your data structure here.
     */
    private int size;
    private ArrayList<Integer> array;
    private int sum;

    public MovingAverage(int size) {
        this.size = size;
        this.array = new ArrayList<>(size + 1);
        this.sum = 0;
    }

    public double next(int val) {
        array.add(val);
        if (array.size() > size) {
            sum -= array.remove(0);
        }
        sum += val;
        return sum / array.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */