package question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.Random;

class _003_findMaxValueTest {
    
    @Test
    @Timeout(value = 5)
    public void testFindMaxValue() {
        _003_findMaxValue fmv = new _003_findMaxValue();
        Random random = new Random();
    
        for (int i = 0; i < 10000; i++) {
            int arrayLength = 1 + random.nextInt(10000);
            int[] array = new int[arrayLength];
            for (int j = 0; j < arrayLength; j++) {
                array[j] = -5000 + random.nextInt(10000);
            }
            Assertions.assertEquals(findMaxValue(array), fmv.findMaxValue(array));
        }
    }
    
    private int findMaxValue(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
}