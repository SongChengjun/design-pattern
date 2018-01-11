package cn.com.song.design.pattern.builder;

import java.util.ArrayList;

/**
 * 建造者模式(将复杂对象的构建与表现分离，相同的构建过程可以创建不同的表示方法)
 *
 * 使用场景：
 *     1.相同的方法，不同的执行顺序，产生不同的结果
 *     2.多个部件装备到一个对象里，不同的部件产生的结果又不相同
 *     3.产品复杂或者调用顺序不同会产生不同的效能
 *     4.对象在创建的过程中会使用系统中的其他对象，而这些对象又不易获取则可以使用构建者模式封装创建过程
 *
 * @author songchengjun
 * @date 2018/1/11 15:06
*/
public class Director {
    ArrayList<String> sequence = new ArrayList<String>();

    BenzBuilder benzBuilder = new BenzBuilder();

    BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getABMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("engineBoom");
        this.sequence.add("alarm");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

}
