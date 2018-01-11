package cn.com.song.design.pattern.proxy;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songchengjun
 * @date 2018/1/11 16:09
*/
public class GamePlayer implements IGamePlayer {

    private static final Logger LOGGER = LoggerFactory.getLogger(GamePlayer.class);

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String name, String password) {
        LOGGER.info(String.format("player %s login", name));
    }

    @Override
    public void killBoss() {
        LOGGER.info("kill a big boss");
    }

    @Override
    public void upgrade() {
        LOGGER.info("upgrade...");
    }
}
