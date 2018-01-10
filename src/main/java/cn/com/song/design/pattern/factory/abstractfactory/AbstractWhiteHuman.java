package cn.com.song.design.pattern.factory.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 16:15
*/
public abstract class AbstractWhiteHuman implements Human {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractWhiteHuman.class);

    public void getColor() {
        LOGGER.info("white color");
    }

    public void talk() {
        LOGGER.info("I'm a white pig");
    }
    
}
