package cn.com.song.design.pattern.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songchengjun
 * @date 2018/1/12 15:54
*/
public class ConcreteColleague1 extends Colleague {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteColleague1.class);

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        LOGGER.info("ConcreteColleague1 receive message:" + message);
    }

}
