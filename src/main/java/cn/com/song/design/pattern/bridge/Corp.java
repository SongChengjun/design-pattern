package cn.com.song.design.pattern.bridge;

/**
 * 桥梁模式(将抽象和实现解耦，使两者可以独立变化)
 *
 * 优点：为解决继承的缺点而提出的设计模式，使得实现可以不受抽象的约束，不用绑定在一个固定的抽象层次上；优秀的扩展能力
 *
 * 使用场景：不希望或不适用继承的场景；接口或抽象类不稳定的场景；重用性要求较高的场景
 *
 * @author cjsong@ronglian.com
 * @date 2018/01/22 22:26
 */
public abstract class Corp {

    private Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        this.product.product();
        this.product.sell();
    }

}
