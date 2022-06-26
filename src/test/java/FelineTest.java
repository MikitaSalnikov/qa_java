import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    @Test
    public void getFamilyNotNull() {
        Feline feline = new Feline();
        Assert.assertNotNull(feline.getFamily());
    }
    @Test
    public void isFeline() {
        Feline feline = new Feline();
        Assert.assertEquals(feline.getFamily(), "Кошачьи");
    }
    @Test
    public void getKittens() {
        Feline feline = new Feline();
        Assert.assertEquals(1, feline.getKittens());
    }
    @Test
    public void getFoodNotNull() throws Exception {
        Feline feline = new Feline();
        Assert.assertNotNull(feline.eatMeat());
    }
    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
