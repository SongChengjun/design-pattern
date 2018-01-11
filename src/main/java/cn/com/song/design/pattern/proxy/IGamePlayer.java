package cn.com.song.design.pattern.proxy;


/**
 * @author songchengjun
 * @date 2018/1/11 16:08
*/
public interface IGamePlayer {

    void login(String name, String password);

    void killBoss();

    void upgrade();
}
