package cn.com.song.design.pattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 15:18
*/
public class WhiteHuman implements Human {

    private static final Logger LOGGER = LoggerFactory.getLogger(WhiteHuman.class);

    public void getColor() {
        LOGGER.info("white color");
    }

    public void talk() {
        LOGGER.info("I'm a white pig");
    }
}
