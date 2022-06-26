import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void createMaleLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }
    @Test
    public void createFemaleLion() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }
    @Test
    public void createAnyLion() {
        try {
            Lion lion = new Lion("Самкамец", feline);
        } catch (Exception e){
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(1, lion.getKittens());
    }
    @Test
    public void getFoodNotNull() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertNotNull(lion.getFood());
    }
    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}