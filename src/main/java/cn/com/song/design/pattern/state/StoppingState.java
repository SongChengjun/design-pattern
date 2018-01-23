package cn.com.song.design.pattern.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 停止状态下可以打开、运行电梯
 *
 * @author songchengjun
 * @date 2018/1/23 17:21
*/
public class StoppingState extends AbstractLiftState {

    private static final Logger LOGGER = LoggerFactory.getLogger(StoppingState.class);

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
        LOGGER.info("电梯停止...");
    }

    @Override
    public void close() {

    }
}
