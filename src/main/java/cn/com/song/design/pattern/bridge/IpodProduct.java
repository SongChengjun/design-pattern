package cn.com.song.design.pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IpodProduct extends Product {

    private final static Logger LOGGER = LoggerFactory.getLogger(IpodProduct.class);

    @Override
    public void product() {
        LOGGER.info("生产ipod...");
    }

    @Override
    public void sell() {
        LOGGER.info("销售ipod");
    }
}
