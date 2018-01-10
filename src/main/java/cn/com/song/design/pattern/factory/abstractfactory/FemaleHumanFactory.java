package cn.com.song.design.pattern.factory.abstractfactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 16:25
*/
public class FemaleHumanFactory extends AbstractHumanFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(FemaleHumanFactory.class);

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
