package cn.com.song.design.pattern.mediator;

/**
 * 中介者模式(用一个中介对象封装一系列其他对象的交互，使对象间的依赖松耦合；中介对象应按职责划分)
 *
 * 优点：减少类之间的依赖，把一对多的依赖变成一对一的依赖
 * 缺点：中介者会膨胀的很大，而且逻辑复杂
 *
 * @author songchengjun
 * @date 2018/1/12 15:52
*/
public abstract class Mediator {

    public abstract void send(String message, Colleague colleague);

}
