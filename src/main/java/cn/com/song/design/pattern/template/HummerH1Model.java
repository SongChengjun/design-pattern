package cn.com.song.design.pattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HummerH1Model extends AbstractHummerModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(HummerH1Model.class);

    public void start() {
        LOGGER.info("H1 start...");
    }

    public void alarm() {
        LOGGER.info("Um...");
    }

    public void engineBoom() {
        LOGGER.info("Boom...");
    }

    public void stop() {
        LOGGER.info("H1 stop...");
    }
}
