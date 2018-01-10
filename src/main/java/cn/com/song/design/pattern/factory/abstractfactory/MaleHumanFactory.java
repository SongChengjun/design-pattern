package cn.com.song.design.pattern.factory.abstractfactory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cjsong@ronglian.com
 * @date 2018/1/10 16:44
*/
public class MaleHumanFactory extends AbstractHumanFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(MaleHumanFactory.class);

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
