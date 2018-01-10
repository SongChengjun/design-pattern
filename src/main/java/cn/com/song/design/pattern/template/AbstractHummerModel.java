package cn.com.song.design.pattern.template;


/**
 * 模板模式(相同一段代码不应该出现两次)
 *  优点：封装不变部分，扩展可变部分；提取公共代码，便于维护；行为由父类控制，子类实现
 *
 * @author cjsong@ronglian.com
 * @date 2018/01/10 23:09
 */
public abstract class AbstractHummerModel {

    /**
     * 基本方法，在子类实现，并在模板方法中被调用
     */
    public abstract void start();

    public abstract void alarm();

    public abstract void engineBoom();

    public abstract void stop();

    /**
     * 模板方法，是一个算法步骤的框架，对基本方法进行调度；
     * 防止恶意操作，应该加上final关键字；
     * 方法中可以添加钩子方法来影响模板方法的执行结果；
     * 开源框架应用很多(spring)
     *
     */
    public final void run() {
        this.start();
        this.alarm();
        this.engineBoom();
        this.stop();
    }


}
