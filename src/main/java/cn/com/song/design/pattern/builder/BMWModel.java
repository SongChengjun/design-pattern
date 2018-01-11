package cn.com.song.design.pattern.builder;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songchengjun
 * @date 2018/1/11 14:53
*/
public class BMWModel extends CarModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(BMWModel.class);

    @Override
    public void start() {
        LOGGER.info("BMW start...");
    }

    @Override
    public void alarm() {
        LOGGER.info("BMW alarm...");
    }

    @Override
    public void engineBoom() {
        LOGGER.info("Boom...");
    }

    @Override
    public void stop() {
        LOGGER.info("BMW stop...");
    }
}
