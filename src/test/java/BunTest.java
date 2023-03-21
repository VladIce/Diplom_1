import org.junit.Test;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;


public class BunTest {
    String expectedName = "Булочка";

    float expectedPrice = 100f;
    Bun bun = new Bun(expectedName , expectedPrice);

    @Test
    public void getNameTest(){
        assertEquals(expectedName, bun.getName());

    }

    @Test
    public void getPriceTest() {
        assertEquals(expectedPrice, bun.getPrice(), 0);
    }
}
