package cn.com.song.design.pattern.observer;

/**
 * 观察者模式(定义对象间一对多的依赖关系，使得每当对象改变状态，所有依赖于它的对象都会得到通知)
 *
 * 优点：观察着与被观察者之间抽象耦合；建立一套触发机制
 * 缺点：一个观察者卡壳会影响整体的执行效率
 *
 * 适用场景：关联行为场景；事件多级触发场景；跨系统消息交换
 *
 * @author songchengjun
 * @date 2018/1/22 11:18
*/
public interface Observable {

    void addObserver(Observer observer);

    void notifyObservers(String msg);

}
