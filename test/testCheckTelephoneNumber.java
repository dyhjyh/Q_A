import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class testCheckTelephoneNumber {
    @Test
    public void testCheck() {
        checkTelephoneNumber ctn = new checkTelephoneNumber();
        Random random = new Random();
        StringBuilder telephoneNumber = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            telephoneNumber.append(1);
            for (int j = 0; j < 10; j++) {
                telephoneNumber.append(random.nextInt(10));
            }
            String number = telephoneNumber.toString();
            Assertions.assertEquals(check(number), ctn.check(number));
        }
    }
    
    public boolean check(String telephoneNumber) {
        return telephoneNumber.matches("1[0-9]{10}");
    }
}
