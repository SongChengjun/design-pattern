package cn.com.song.design.pattern.factory.abstractfactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 16:17
*/
public class FemaleBlackHuman extends AbstractBlackHuman {

    private static final Logger LOGGER = LoggerFactory.getLogger(FemaleBlackHuman.class);

    public void getSex() {
        LOGGER.info("female black");
    }
}
