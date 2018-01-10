package cn.com.song.design.pattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 15:13
*/
public class BlackHuman implements Human {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlackHuman.class);

    public void getColor() {
        LOGGER.info("black color");
    }

    public void talk() {
        LOGGER.info("I am the Negro");

    }
}
