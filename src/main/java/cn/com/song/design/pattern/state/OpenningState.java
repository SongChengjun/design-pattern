package cn.com.song.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenningState extends AbstractLiftState {

    private static final Logger LOGGER = LoggerFactory.getLogger(OpenningState.class);

    @Override
    public void open() {
        LOGGER.info("电梯开启...");
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    /**
     * 电梯开启状态下只能关闭
     */
    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.getLiftState().close();
    }
}
