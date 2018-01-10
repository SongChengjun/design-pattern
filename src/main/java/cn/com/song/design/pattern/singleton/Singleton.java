package cn.com.song.design.pattern.singleton;

/**
 * 单例模式
 * @author: cjsong@ronglian.com
 * @date: 2018/1/10 10:53
*/
public class Singleton {

    /**
     * 自行创建实例对象(饿汉式单例模式)
     */
    private static Singleton singleton = new Singleton();

    /**
     * 设为私有方法，防止外部通过构造函数创建实例
     * @param: []
     * @return:
    */
    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    /**
     * 懒汉式单例
     */
    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
