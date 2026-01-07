package tests.hh;

import org.hh.Base.HhResumePage;
import org.junit.Test;

public class HhTest extends BaseTest{

    private final static String URL="https://kazan.hh.ru/resume/9821e556ff0c22bb2f0039ed1f444433557162?from=share_ios";

    @Test
    public void checkAttributeHashMap(){
        HhResumePage hhResumePage = new HhResumePage(URL);
    }
}
