package exercises.ex09_gepast_betalen;

import java.util.List;

public class GepastBetalen {

    public static boolean kanGepastBetalen(int bedrag, List<Integer> munten) {
        if(bedrag == 0) return true;
        if(bedrag < 0) return false;
        if(munten.isEmpty()) return false;

        var firstCoin = munten.getFirst();
        var otherCoins = munten.subList(1, munten.size());

        return kanGepastBetalen(bedrag - firstCoin, otherCoins)
                || kanGepastBetalen(bedrag, otherCoins);


    }
}
