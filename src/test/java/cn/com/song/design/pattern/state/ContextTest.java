package cn.com.song.design.pattern.state;

import org.junit.Test;

public class ContextTest {
    @Test
    public void open() throws Exception {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }

}