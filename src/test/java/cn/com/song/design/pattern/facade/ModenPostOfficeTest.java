package cn.com.song.design.pattern.facade;

import org.junit.Test;

public class ModenPostOfficeTest {
    @Test
    public void sendLetter() throws Exception {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("Dear...", "Beijing");
    }

}