package cn.com.song.design.pattern.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 代理模式--静态(对其他对象提供代理以控制对这个对象的访问)
 *
 * 被代理类与代理类实现相同的接口/抽象类，代理类把所有接口方法限制委托给被代理类执行，
 * 并且可以在被代理类执行时做一些前置处理和后置处理
 *
 *
 * @author songchengjun
 * @date 2018/1/11 16:15
*/
public class GamePlayerProxy implements IGamePlayer {

    private static final Logger LOGGER = LoggerFactory.getLogger(GamePlayerProxy.class);

    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String name, String password) {
        this.gamePlayer.login(name, password);
    }

    @Override
    public void killBoss() {
        //前置处理
        this.before();
        this.gamePlayer.killBoss();
        //后置处理
        this.after();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    private void before() {
        LOGGER.info("change equipment");
    }

    private void after() {
        LOGGER.info("gain rewards");
    }

}
