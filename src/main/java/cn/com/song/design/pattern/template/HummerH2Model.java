package cn.com.song.design.pattern.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HummerH2Model extends AbstractHummerModel {

    private static final Logger LOGGER = LoggerFactory.getLogger(HummerH2Model.class);

    public void start() {
        LOGGER.info("H2 start...");
    }

    public void alarm() {
        LOGGER.info("Um...");
    }

    public void engineBoom() {
        LOGGER.info("Boom...");
    }

    public void stop() {
        LOGGER.info("H2 stop...");
    }
}
