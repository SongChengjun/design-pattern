package cn.com.song.design.pattern.flyweight;

import org.junit.Test;

public class SignInfoFactoryTest {
    @Test
    public void getSignInfo() throws Exception {
        String key = "科目二/北京";
        SignInfoFactory signInfoFactory = new SignInfoFactory();
        signInfoFactory.getSignInfo(key);
        signInfoFactory.getSignInfo(key);

    }

}