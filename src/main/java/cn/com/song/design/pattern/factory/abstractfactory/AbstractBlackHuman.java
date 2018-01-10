package cn.com.song.design.pattern.factory.abstractfactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 16:09
*/
public abstract class AbstractBlackHuman implements Human {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractBlackHuman.class);

    public void getColor() {
        LOGGER.info("black color");
    }

    public void talk() {
        LOGGER.info("I am the Negro");
    }

}
