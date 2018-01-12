package cn.com.song.design.pattern.template;

import org.junit.Test;

public class TemplateTest {

    @Test
    public void run() throws Exception {
        AbstractHummerModel hummerH1Model = new HummerH1Model();
        hummerH1Model.run();

        AbstractHummerModel hummerH2Model = new HummerH2Model();
        hummerH2Model.run();
    }

}