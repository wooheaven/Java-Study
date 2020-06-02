package rwoo.research;

public class DoubleComparision {
    private static final double EPSILON = 1E-15;

    public static double findDelta(double d1, double d2) {
        return Math.abs(d1 - d2);
    }

    public static boolean isEqauls(double d1, double d2) {
        return d1 == d2 || isRelativelyEqual(d1, d2);
    }

    private static boolean isRelativelyEqual(double d1, double d2) {
        return findDelta(d1, d2) < EPSILON;
    }
}