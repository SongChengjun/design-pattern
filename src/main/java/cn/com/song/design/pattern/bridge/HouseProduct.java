package cn.com.song.design.pattern.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实例化角色
 */
public class HouseProduct extends Product {

    private final static Logger LOGGER = LoggerFactory.getLogger(HouseProduct.class);

    @Override
    public void product() {
        LOGGER.info("生产房子...");
    }

    @Override
    public void sell() {
        LOGGER.info("销售房子...");
    }
}
