package cn.com.song.design.pattern.factory.abstractfactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10
*/
public class MaleWhiteHuman extends AbstractWhiteHuman {

    private static final Logger LOGGER = LoggerFactory.getLogger(MaleWhiteHuman.class);

    public void getSex() {
        LOGGER.info("male white");
    }
}
