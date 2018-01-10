package cn.com.song.design.pattern.factory.abstractfactory;

import org.junit.Test;

public class AbstractHumanFactoryTest {

    @Test
    public void createBlackHuman() throws Exception {
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        Human maleBlackHuman = maleHumanFactory.createBlackHuman();
        maleBlackHuman.getSex();
        maleBlackHuman.getColor();
        maleBlackHuman.talk();

        FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();
        Human femaleBlackHuman = femaleHumanFactory.createBlackHuman();
        femaleBlackHuman.getSex();
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
    }

    @Test
    public void createWhiteHuman() throws Exception {
    }

}