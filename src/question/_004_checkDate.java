package question;

import java.util.Scanner;

/**
 * 004.
 *  When using the system, the user is required to input the following information:
 *  Student ID, Temperature, Nucleic Acid PCR test result (Y, N). Each parameter has specific requirements:
 *    (1) Student ID: an integer number with 8-digit and the first digit can't be "0"
 *    (2) Temperature: a float number 35.0<T<45.0
 *    (3) Nucleic Acid PCR test result: string with Y (finished) or N (unfinished)
 */
public class _004_checkDate {
    public static void main(String[] args) {
        //try (Scanner sc = new Scanner(System.in)) {
            Scanner sc = new Scanner(System.in);
            boolean isRight = true;
            StringBuilder sb = new StringBuilder();
            
            String id = sc.next();
            String temperature = sc.next();
            String result = sc.next();
        
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
                System.out.println("Submit successfully");
            } else {
                System.out.println(sb);
            }
        //}
    }
}
