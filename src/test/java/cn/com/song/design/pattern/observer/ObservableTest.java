package cn.com.song.design.pattern.observer;

import org.junit.Test;

public class ObservableTest {
    @Test
    public void notifyObservers() throws Exception {
        Observer lisi = new Lisi();
        HanFeizi hanFeizi = new HanFeizi();

        hanFeizi.addObserver(lisi);
        hanFeizi.haveBreakfirst();

    }

}