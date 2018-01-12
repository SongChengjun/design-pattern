package cn.com.song.design.pattern.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songchengjun
 * @date 2018/1/12 17:02
*/
public class CodeGroup extends Group {

    private static final Logger LOGGER = LoggerFactory.getLogger(CodeGroup.class);

    @Override
    public void find() {
        LOGGER.info("find code group...");
    }

    @Override
    public void add() {
        LOGGER.info("add...");
    }

    @Override
    public void delete() {
        LOGGER.info("delete...");
    }

    @Override
    public void change() {
        LOGGER.info("change...");
    }
}
