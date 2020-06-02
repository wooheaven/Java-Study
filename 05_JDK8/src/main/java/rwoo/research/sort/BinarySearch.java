package rwoo.research.sort;

public class BinarySearch {

    public static int search(int[] input, int num) {
        int min = 0;
        int max = input.length - 1;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            int currentNum = input[mid];
            if (currentNum == num) {
                return mid;
            } else if (currentNum < num) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static int findRootSquareBS(int num) {
        int min = 0;
        int max = num;
        int mid = 0;
        while (min <= max) {
            mid = (min + max) / 2;
            int currentNum = mid * mid;
            if (currentNum == num) {
                return mid;
            } else if (currentNum < num) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static int findRootSquareWhile(int num) {
        for (int i = 1; i < num; i++) {
            int currentNum = i * i;
            if (currentNum == num) {
                return i;
            }
        }
        return -1;
    }
}
