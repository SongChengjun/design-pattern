package cn.com.song.design.pattern.prototype;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrototypeTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrototypeTest.class);

    @Test
    public void testSendMail() {
        long max_count = 5L;
        Mail mail = new Mail(new AdvTemplate());
        int i = 0;
        while (i < max_count) {
            //对象浅拷贝
            Mail cloneMail = mail.clone();
            cloneMail.setReceivers(String.valueOf(i));
            PrototypeTest.sendMail(cloneMail);
            i++;
        }
    }

    private static void sendMail(Mail mail) {
        LOGGER.info(mail.getReceivers() + ":" + mail.getSubject() + "--" + mail.getContext());
    }

}