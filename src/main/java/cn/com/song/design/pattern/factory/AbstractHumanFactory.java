package cn.com.song.design.pattern.factory;


/**
 * 工厂模式：
 * 创建对象的抽象接口，让子类决定实例化哪个类
 *
 * 优点：良好的封装性、易于扩展、屏蔽具体产品类
 *
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 15:23
*/
public abstract class AbstractHumanFactory {

    /**
     * 创建不同人种的人
     * @param humanClass Human接口实现类
     * @return T
    */
    public abstract <T extends Human> T createHuman(Class<T> humanClass);

}
