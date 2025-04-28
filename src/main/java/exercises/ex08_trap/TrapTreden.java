package exercises.ex08_trap;

public class TrapTreden {
    public static int trapTreden(int n) {
        if (n <= 1) return 1;

        // beginnen met 1 stap
        var keuze1 = trapTreden(n - 1);
        // beginnen met 2 stappen
        var keuze2 = trapTreden(n - 2);


        return keuze1 + keuze2;

    }

}
