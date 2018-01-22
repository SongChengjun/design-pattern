package cn.com.song.design.pattern.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 监听者李斯(王斯、刘斯...)
 *
 * @author songchengjun
 * @date 2018/1/22 11:01
*/
public class Lisi implements Observer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Lisi.class);

    @Override
    public void update(String msg) {
        LOGGER.info("监听到消息：" + msg);
        this.reportQiShiHuang(msg);
    }

    private void reportQiShiHuang(String msg) {

    }
}
