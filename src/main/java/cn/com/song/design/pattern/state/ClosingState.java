package cn.com.song.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClosingState extends AbstractLiftState {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClosingState.class);

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENNING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }

    @Override
    public void close() {
        LOGGER.info("电梯关闭...");
    }
}
