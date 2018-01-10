package cn.com.song.design.pattern.factory.abstractfactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 16:18
*/
public class MaleBlackHuman extends AbstractBlackHuman {
    private static final Logger LOGGER = LoggerFactory.getLogger(MaleBlackHuman.class);

    public void getSex() {
        LOGGER.info("male black");
    }
}
