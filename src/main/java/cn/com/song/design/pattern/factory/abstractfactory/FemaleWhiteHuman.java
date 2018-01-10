package cn.com.song.design.pattern.factory.abstractfactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 16:19
*/
public class FemaleWhiteHuman extends AbstractWhiteHuman {

    private static final Logger LOGGER = LoggerFactory.getLogger(FemaleWhiteHuman.class);

    public void getSex() {
        LOGGER.info("female white");
    }
}
