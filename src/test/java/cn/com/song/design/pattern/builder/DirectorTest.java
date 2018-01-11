package cn.com.song.design.pattern.builder;

import org.junit.Test;

public class DirectorTest {

    @Test
    public void testDirector() {
        Director director = new Director();
        director.getABenzModel().run();
        director.getBBenzModel().run();
        director.getABMWModel().run();
    }

}