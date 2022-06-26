import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundNotNull() {
        Cat cat = new Cat(feline);
        Assert.assertNotNull(cat.getSound());
    }
    @Test
    public void soundIsMya() {
        Cat cat = new Cat(feline);
        Assert.assertEquals(cat.getSound(), "Мяу");
    }
    @Test
    public void getFoodNotNull() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertNotNull(cat.getFood());
    }
    @Test
    public void isPredator() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertEquals(List.of(), cat.getFood());
    }
}
