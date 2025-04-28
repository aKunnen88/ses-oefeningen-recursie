package exercises.ex06_power;

public class Power {

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n > 0) {
            if (n % 2 == 0) {
                double halfPower = power(x, n / 2);
                return halfPower * halfPower;
            } else {
                return x * power(x, n - 1);
            }
        } else {
            return 1 / power(x, n - 1);
        }

    }
}
