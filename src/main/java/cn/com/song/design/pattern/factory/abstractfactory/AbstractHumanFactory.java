package cn.com.song.design.pattern.factory.abstractfactory;

/**
 * 抽象工厂模式
 *
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 16:22
*/
public abstract class AbstractHumanFactory {

    public abstract Human createBlackHuman();

    public abstract Human createWhiteHuman();

}
