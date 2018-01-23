package cn.com.song.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunningState extends AbstractLiftState {

    private static final Logger LOGGER = LoggerFactory.getLogger(RunningState.class);

    @Override
    public void open() {

    }

    @Override
    public void run() {
        LOGGER.info("电梯运行中...");
    }

    /**
     * 电梯运行状态下只能停止
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }

    @Override
    public void close() {

    }
}
