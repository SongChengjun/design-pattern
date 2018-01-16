package cn.com.song.design.pattern.strategy;

import org.junit.Test;

public class IStrategyTest {
    @Test
    public void operate() throws Exception {
        Context context = new Context(new BackDoor());
        context.operate();

        context = new Context(new GiveGreenLight());
        context.operate();

        context = new Context(new BlockEnemy());
        context.operate();
    }

}