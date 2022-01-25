package answer;

/**
 * 001.
 * 完成方法check，检测传入的字符串是否为合法手机号码（以数字1开头且为十一位阿拉伯数字），合法返回ture，否则返回false。
 */
public class _001_checkTelephoneNumberAnswer {
    
    public boolean check(String telephoneNumber) {
        /* 001_1:
        if (telephoneNumber.length() == 11 && telephoneNumber.charAt(0) == '1') {
            try {
                Long.parseLong(telephoneNumber);
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        }
        return false;
        */
        return false;
    }
}
