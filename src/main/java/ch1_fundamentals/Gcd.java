package ch1_fundamentals;

public class Gcd {
    /**
     * Find the greatest common divisor of two numbers
     *
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
