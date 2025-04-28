package exercises.ex10_gepast_betalen_bis;

import java.util.List;

public class GepastBetalenBis {

    public static int countChange(int amount, List<Integer> coinValues) {
        if(amount < 0) return 0;
        if(amount == 0) return 1;
        if(coinValues.isEmpty()) return 0;

        var firstCoin = coinValues.getFirst();
        var otherCoins = coinValues.subList(1, coinValues.size());
        return countChange(amount - firstCoin, coinValues)
                + countChange(amount, otherCoins);

        // We gaan kijken of we 5 gebruiken om te betalen of niet, als we 5 gebruiken
        // dan verglagen we de amount met -5 = firstCoin en anders gebruiken we alle amounts
        // zonder de 5, = otherCoins


    }
}
