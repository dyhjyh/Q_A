import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import question._001_checkTelephoneNumber;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class _001_checkTelephoneNumberTest {
    @Test
    @Timeout(value = 300, unit = TimeUnit.MILLISECONDS)
    public void testCheck() {
        _001_checkTelephoneNumber ctn = new _001_checkTelephoneNumber();
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            StringBuilder telephoneNumber = new StringBuilder();
            for (int j = 0; j < random.nextInt(5) + 9; j++) {
                telephoneNumber.append(random.nextInt(10));
            }
            if (random.nextDouble() > 0.7) {
                telephoneNumber.replace(1, 3, "hhh");
            }
            String number = telephoneNumber.toString();
            System.out.println(number);
            Assertions.assertEquals(check(number), ctn.check(number));
        }
    }
    
    public boolean check(String telephoneNumber) {
        return telephoneNumber.matches("1[0-9]{10}");
    }
}
