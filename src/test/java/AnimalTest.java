import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String foodPriority;
    private final List<String> expected;

    public AnimalTest(String foodPriority, List<String> expected){
        this.foodPriority=foodPriority;
        this.expected=expected;
    }
    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void expectExeption() {
        Animal animal = new Animal();
        try {
            animal.getFood("Всеядное");
        } catch (Exception e){
            Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
    @Test
    public void isVegan() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(expected, animal.getFood(foodPriority));
    }
    @Test
    public void getFamily() {
        Animal animal = new Animal();
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
