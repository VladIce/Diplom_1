import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;

import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

    private String expectedName = "Соус Spicy-X";

    private float expectedPrice = 120f;

    Ingredient ingredient = new Ingredient(SAUCE, expectedName, expectedPrice);


    @Test
    public void getTypeTest () {
        Assert.assertEquals(SAUCE, ingredient.getType());
    }

    @Test
    public void getNameTest(){
        Assert.assertEquals(expectedName, ingredient.getName());
    }

    @Test
    public void getPriceTest(){
        Assert.assertEquals(expectedPrice, ingredient.getPrice(), 0);
    }


}
