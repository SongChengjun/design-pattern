package cn.com.song.design.pattern.proxy.dynamic;

import cn.com.song.design.pattern.proxy.GamePlayer;
import cn.com.song.design.pattern.proxy.IGamePlayer;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class GamePlayerInvocationHandlerTest {

    @Test
    public void invoke() throws Exception {
        GamePlayer gamePlayer = new GamePlayer("songchengjun");
        InvocationHandler handler = new GamePlayerInvocationHandler(gamePlayer);
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(
                gamePlayer.getClass().getClassLoader(), gamePlayer.getClass().getInterfaces(), handler);
        proxy.login("songchengjun", "123456");
        proxy.killBoss();
        proxy.upgrade();
    }

}