import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class BasketProblemTest {

    FRUIT APPLE = FRUIT.APPLE;
    FRUIT BANANA = FRUIT.BANANA;
    FRUIT MELON = FRUIT.MELON;
    FRUIT LIME = FRUIT.LIME;

    // One item baskets

        // No scheme baskets
        @Test
        public void noSchemeSingleItem() {

            FRUIT[] basket = {APPLE, APPLE, APPLE, APPLE};
            int expected = 140;
            int actual = BasketProblem.calculateBasketTotalCost(basket);

            assertEquals(expected, actual);

        }

        // Even no of melons
        @Test
        public void evenMelonsSingleItem() {

            FRUIT[] basket = {MELON, MELON, MELON, MELON, MELON, MELON};
            int expected = 150;
            int actual = BasketProblem.calculateBasketTotalCost(basket);

            assertEquals(expected, actual);

        }

        // Odd no of melons
        @Test
        public void oddMelonsSingleItem() {

            FRUIT[] basket = {MELON, MELON, MELON, MELON, MELON};
            int expected = 150;
            int actual = BasketProblem.calculateBasketTotalCost(basket);

            assertEquals(expected, actual);

        }

        // Limes in multiple of 3
        @Test
        public void limes3xSingleItem() {

            FRUIT[] basket = {LIME, LIME, LIME, LIME, LIME, LIME};
            int expected = 60;
            int actual = BasketProblem.calculateBasketTotalCost(basket);

            assertEquals(expected, actual);

        }

        // Limes in non-multiple of 3
        @Test
        public void limesNon3xSingleItem1() {

            FRUIT[] basket = {LIME, LIME, LIME, LIME};
            int expected = 45;
            int actual = BasketProblem.calculateBasketTotalCost(basket);

            assertEquals(expected, actual);

        }

        @Test
        public void limesNon3xSingleItem2() {

            FRUIT[] basket = {LIME, LIME, LIME, LIME, LIME};
            int expected = 60;
            int actual = BasketProblem.calculateBasketTotalCost(basket);

            assertEquals(expected, actual);

        }

    // Mixed item baskets    

    @Test
    public void multipleItem1() {

        FRUIT[] basket = {APPLE, BANANA, MELON, LIME};
        int expected = 120;
        int actual = BasketProblem.calculateBasketTotalCost(basket);

        assertEquals(expected, actual);

    }

    @Test
    public void multipleItem2() {

        FRUIT[] basket = {APPLE, APPLE, MELON, MELON, MELON, BANANA, BANANA, LIME, LIME, LIME, LIME};
        int expected = 255;
        int actual = BasketProblem.calculateBasketTotalCost(basket);

        assertEquals(expected, actual);

    }
}
