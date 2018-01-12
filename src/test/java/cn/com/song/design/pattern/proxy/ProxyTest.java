package cn.com.song.design.pattern.proxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void testProxy() {
        IGamePlayer gamePlayer = new GamePlayer("songchengjun");
        IGamePlayer iGamePlayerProxy = new GamePlayerProxy(gamePlayer);

        iGamePlayerProxy.login("songchengjun", "123456");
        iGamePlayerProxy.killBoss();
        iGamePlayerProxy.upgrade();

    }

}