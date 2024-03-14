import java.util.Arrays;

public class BasketProblem {

    private static int appleCost  = FRUIT.APPLE.getPrice();
    private static int bananaCost = FRUIT.BANANA.getPrice();
    private static int melonCost = FRUIT.MELON.getPrice();
    private static int limeCost = FRUIT.LIME.getPrice();
    
    
    /** 
     * Calculates the total cost of the given basket based on individual costs of fruits as follows: 
     * 
     * Apple = 35p;
     * Banana = 20p;
     * Melon = 50p;
     * Lime = 15 p;
     * 
     * Additionally, there are 2 schemes involved: 
     * Melons => Buy 1 Get 1;
     * Limes => 3 for the price of 2;
     * 
     * @param basket    A collection of fruits to be accounted for.
     * @return int      Total cost of the given basket in paisa.
     */
    public static int calculateBasketTotalCost(FRUIT[] basket) {

        int appleCount = getNoOf(basket, FRUIT.APPLE);
        int bananaCount = getNoOf(basket, FRUIT.BANANA);
        int melonCount = getNoOf(basket, FRUIT.MELON);
        int limeCount = getNoOf(basket, FRUIT.LIME  );
        
        int price = 0;

        price = appleCount*appleCost + 
                bananaCount*bananaCost +
                (melonCount/2 + melonCount%2) * melonCost +     // Buy 1 Get 1
                ((limeCount/3)*2 + (limeCount%3))*limeCost;     // 3 For Price of 2 (reminder at regular price)

        return price;
    }

    /** 
     * Counts the number of occurrences of a specific fruit in the given basket.
     * 
     * @param basket    A collection of fruits to be counted from.
     * @param fruit     A fruit to whose number of occurances in the basket need to be counted.
     * @return          Number of occurances of the specified fruit in basket.
     */
    public static int getNoOf(FRUIT[] basket, FRUIT fruit) {

        int count =(int) Arrays.stream(basket)
            .filter(fruitTemp -> fruitTemp == fruit)
            .count();

        return count;
    }
    
}
