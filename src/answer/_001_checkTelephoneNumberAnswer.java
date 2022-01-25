package answer;

/**
 * 001.
 * 完成方法check，检测传入的字符串是否为合法手机号码（以数字1开头且为十一位阿拉伯数字），合法返回ture，否则返回false。
 */
public class _001_checkTelephoneNumberAnswer {
    
    public boolean check(String telephoneNumber) {
        /* 001_1:
            return telephoneNumber.matches("1[0-9]{10}");
         */
        
        /* 001_2:
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
        
        /* 001_3:(HHB)
            if(telephoneNumber.length()!=11||telephoneNumber.length()==0)return false;
            char[] midstr=telephoneNumber.toCharArray();
            if(midstr[0]!='1')return false;
            for(int i=telephoneNumber.length()-1;i>1;i--)
                if(!Character.isDigit(midstr[i]))return false;
            return true;
         */
        return false;
    }
}
