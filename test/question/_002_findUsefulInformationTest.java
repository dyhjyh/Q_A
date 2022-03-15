package question;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _002_findUsefulInformationTest {
    private final static _002_findUsefulInformation fui = new _002_findUsefulInformation();
    private final String information1 = "";
    private final String information2 = null;
    private final String information3 = "电 teqrter话: jfafjio joi13678585912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 10110520" +
            "@mail.edu.cn邮re tre tre箱: re r er 5687954556@qq.com, Q wertrwe Q: rtret1234568900ret erter er tr er tert";
    private final String information4 = "电 teqrter话: jfafjio joi23678585912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i _10110520" +
            "@mail.edu.cn邮re tre tre箱: re r er 5687954556@qq.com, Q wertrwe Q: rtret1234568900ret erter er tr er tert";
    private final String information5 = "电 teqrter话: jfafjio joi13678585912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 10110520" +
            "@mail.edu.CN邮re tre tre箱: re r er 5687954556@QQ.com, Q wertrwe Q: rtret1234568900ret erter er tr er tert";
    private final String information6 = "电 teqrter话: jfafjio joi13678585912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 10110520" +
            "$mail.edu.cn邮re tre tre箱: re r er 5687954556@qQ.com, Q wertrwe Q: rtret15234568900ret erter er tr er tert";
    private final String information7 = "电 teqrter话: jfafjio joia13678585912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 10110520_" +
            "@mail.edu.cn邮re tre tre箱: re r er 5687954556@qq.com, Q wertrwe Q: rtret01234568900ret erter er tr er tert";
    private final String information8 = "电 teqrter话: jfafjio joi1367858a5912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 10110520" +
            "@mail.edu. cn邮re tre tre箱: re r er 5687954556@qq. com, Q wertrwe Q: rtret1234568900ret erter er tr er tert";
    private final String information9 = "电 teqrter话: jfafjio joi136785_85912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 10110520" +
            "@mail。edu.cn邮re tre tre箱: re r er 5687954556@qq.com, Q wertrwe Q: rtret1234568900ret erter er tr er tert";
    private final String information10 = "电 teqrter话: jfafjio joi1367 8585912ew werfwerf wef ,  邮er ter 箱:djifjai ojargj i 10110520" +
            "@ mail.edu.cn邮re tre tre箱: re r er 5687954556@qq.com.com.com.com, Q wertrwe Q: rtret1234568900ret erter er tr er tert";
    
    
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void testFindTelephone() {
        Assertions.assertEquals(findTelephone(information1), fui.findTelephone(information1));
        Assertions.assertEquals(findTelephone(information2), fui.findTelephone(information2));
        Assertions.assertEquals(findTelephone(information3), fui.findTelephone(information3));
        Assertions.assertEquals(findTelephone(information4), fui.findTelephone(information4));
        Assertions.assertEquals(findTelephone(information5), fui.findTelephone(information5));
        Assertions.assertEquals(findTelephone(information6), fui.findTelephone(information6));
        Assertions.assertEquals(findTelephone(information7), fui.findTelephone(information7));
        Assertions.assertEquals(findTelephone(information8), fui.findTelephone(information8));
        Assertions.assertEquals(findTelephone(information9), fui.findTelephone(information9));
        Assertions.assertEquals(findTelephone(information10), fui.findTelephone(information10));
    }
    
    public List<String> findTelephone(String information) {
        List<String> list = new ArrayList<>();
        if (information == null) {
            System.out.println(list);
            return list;
        }
        Pattern pattern = Pattern.compile("1\\d{10}");
        Matcher matcher = pattern.matcher(information);
        while(matcher.find()) {
            list.add(matcher.group());
        }
        System.out.println(list);
        return list;
    }
    
    
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    public void testFindMail() {
        Assertions.assertEquals(findMail(information1), fui.findMail(information1));
        Assertions.assertEquals(findMail(information2), fui.findMail(information2));
        Assertions.assertEquals(findMail(information3), fui.findMail(information3));
        Assertions.assertEquals(findMail(information4), fui.findMail(information4));
        Assertions.assertEquals(findMail(information5), fui.findMail(information5));
        Assertions.assertEquals(findMail(information6), fui.findMail(information6));
        Assertions.assertEquals(findMail(information7), fui.findMail(information7));
        Assertions.assertEquals(findMail(information8), fui.findMail(information8));
        Assertions.assertEquals(findMail(information9), fui.findMail(information9));
        Assertions.assertEquals(findMail(information10), fui.findMail(information10));
    }
    
    public List<String> findMail(String information) {
        List<String> list = new ArrayList<>();
        if (information == null) {
            System.out.println(list);
            return list;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-z]+){1,4}");
        Matcher matcher = pattern.matcher(information);
        while(matcher.find()) {
            list.add(matcher.group());
        }
        System.out.println(list);
        return list;
    }
    
}
