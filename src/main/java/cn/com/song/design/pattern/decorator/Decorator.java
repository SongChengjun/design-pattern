package cn.com.song.design.pattern.decorator;


/**
 * 装饰者模式(动态地给对象添加一些额外的职责)
 *
 * 说明：在该模式中必然有个最基本、最核心的接口或者抽象类(SchoolReport)充当抽象构件
 *
 * 使用场景：扩展一个类的功能；动态地增加或撤销功能
 *
 * 优点：装饰类和被装饰类可以独立发展，而不会互相耦合；是继承关系的替代方案
 * 缺点：多层装饰是比较复杂的(见单元测试)
 *
 *  @author cjsong@ronglian.com
 *  @date 2018/01/16 21:09
 */
public abstract class Decorator extends SchoolReport {

    private SchoolReport realSchoolReport;

    public Decorator(SchoolReport realSchoolReport) {
        this.realSchoolReport = realSchoolReport;
    }

    @Override
    public void report() {
        this.realSchoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.realSchoolReport.sign(name);

    }
}
