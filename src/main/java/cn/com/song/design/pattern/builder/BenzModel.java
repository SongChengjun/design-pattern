package cn.com.song.design.pattern.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songchengjun
 * @date 2018/1/11 14:51
*/
public class BenzModel extends CarModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(BenzModel.class);

    @Override
    public void start() {
        LOGGER.info("Benz start...");
    }

    @Override
    public void alarm() {
        LOGGER.info("Benz alarm...");
    }

    @Override
    public void engineBoom() {
        LOGGER.info("Boom...");
    }

    @Override
    public void stop() {
        LOGGER.info("Benz stop...");
    }
}
