package cn.com.song.design.pattern.ResponsibilityChain;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractHandlerTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(AbstractHandlerTest.class);

    @Test
    public void handleRequest() throws Exception {
        Iwomen women = new women(Level.HANSBAN_LEVEL, new Request("逛街"));

        Father father = new Father(Level.FATHER_LEVEL);
        Husband hansband = new Husband(Level.HANSBAN_LEVEL);
        Son son = new Son(Level.SON_LEVEL);

        father.setHandle(hansband);
        hansband.setHandle(son);

        Response response = father.handlerChain(women);
        LOGGER.info(response.getResult());

    }

}