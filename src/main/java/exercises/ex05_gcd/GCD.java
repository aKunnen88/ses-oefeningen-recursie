package exercises.ex05_gcd;

public class GCD {

    public static int gcd(int x, int y) {
        if (y>x) return gcd(y, x);

        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
