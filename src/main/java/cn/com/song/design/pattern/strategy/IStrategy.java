package cn.com.song.design.pattern.strategy;

/**
 * 策略模式(定义一组算法，将每个算法都封装起来(Context)，并使它们之间可以互换)
 *
 * 案例场景：诸葛亮锦囊妙计(按天机打开三个锦囊以解决棘手问题)
 *
 * 优点：扩展性好；由其它模块决定采用何种策略，策略家族对外提供的访问接口就是封装类(锦囊)
 * 缺点：每个策略都是一个类，复用的可能性小，类数量增多；高层模块需要知道有哪些策略，违反迪米特法则
 *
 *  @author cjsong@ronglian.com
 *  @date 2018/01/16 21:49
 */
public interface IStrategy {

    void operate();
}
