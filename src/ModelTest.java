import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    @Test
    void rand() {
        Model model=new Model();
        int n = model.rand(9,9);
        assertEquals(9,n);
    }

    @Test
    void rand1() {  //проверяем, что число создается меньше 100 и больше 0
        int minValue = 0;
        int maxValue = 0;
        int actualResult;
        Model model = new Model();

        for (int i = 0; i < 100; i++) {
            actualResult = model.rand(minValue, maxValue);
            assertTrue(actualResult <= maxValue && actualResult >= minValue);
        }
    }

    @Test
    void rand2() {  //проверяем, что число создается меньше 100 и больше 0
        int minValue = 0;
        int maxValue = 100;
        int actualResult;
        Model model = new Model();
        boolean isRandCreatedHighLimitOfRange=false;

        for (int i = 0; i < 100; i++) {
            actualResult = model.rand(minValue, maxValue);
            if (actualResult == maxValue){
                isRandCreatedHighLimitOfRange = true;
            }
        }
        assertTrue(isRandCreatedHighLimitOfRange);
    }

}