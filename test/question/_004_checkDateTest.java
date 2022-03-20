package question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

class _004_checkDateTest {
    
    @Test
    public void testMain() throws IOException {
        OutputStream os = new ByteArrayOutputStream();
        FileInputStream is = new FileInputStream("testcases\\004.txt");
        BufferedReader br = new BufferedReader(new FileReader("testcases\\004.txt"));
        System.setIn(is);
        System.setOut(new PrintStream(os));
        String line;
        while (true) {
            line = br.readLine();
            _004_checkDate.main(null);
            if (line == null) {
                break;
            }
            Assertions.assertEquals(main(line), os.toString());
        }
    }
    
    private String main(String data) {
        boolean isRight = true;
        StringBuilder sb = new StringBuilder();
        String[] elements = data.split(" ");
    
        String id = elements[0];
        String temperature = elements[1];
        String result = elements[2];
    
        try {
            Long.parseLong(id);
            if (id.length() != 8 || id.startsWith("0")) {
                throw new Exception();
            }
        } catch (Exception e) {
            sb.append("Error in Student ID");
            isRight = false;
        }
    
        try {
            if (Double.parseDouble(temperature) <= 35.0 || Double.parseDouble(temperature) >= 45.0) {
                throw new Exception();
            }
        } catch (Exception e) {
            if (sb.isEmpty()) {
                sb.append("Error in Temperature");
            } else {
                sb.append(" and Temperature");
            }
            isRight = false;
        }
    
        if (!(result.equals("Y") || result.equals("N"))) {
            if (sb.isEmpty()) {
                sb.append("Error in Nucleic Acid PCR test");
            } else {
                sb.append(" and Nucleic Acid PCR test");
            }
            isRight = false;
        }
    
        if (isRight) {
            return "Submit successfully\r\n";
        } else {
            return sb + "\r\n";
        }
    }
}