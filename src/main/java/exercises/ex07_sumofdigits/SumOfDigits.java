package exercises.ex07_sumofdigits;

public class SumOfDigits {
    public static int sumOfDigits(long number) {
        if (number < 0) throw new IllegalArgumentException();
        if (number < 10) return (int) number;

        return sumOfDigits(sumAllDigits(number));
    }

    private static long sumAllDigits(long number) {
        if (number < 10) return number;

        var lastDigit = number % 10;
        var otherDigits = number/10;
        return lastDigit + sumAllDigits(otherDigits);

    }
}
