package cn.com.song.design.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 访问者模式(封装一些作用于某种数据结构中的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新操作)
 *
 * 优点：符合单一职责原则；优秀的扩展性；灵活
 * 缺点：具体元素对访问者公布细节；具体元素变更比较困难；违背依赖倒置原则(访问者依赖的是具体的元素)
 *
 * @author cjsong@ronglian.com
 * @date 2018/01/22 22:26
 */
public class Visitor implements IVisitor {

    private final static Logger LOGGER = LoggerFactory.getLogger(Visitor.class);

    @Override
    public void visit(ManagerEmployee managerEmployee) {
        LOGGER.info(this.getBasicInfo(managerEmployee) + ", performance:" + managerEmployee.getPerformance());

    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        LOGGER.info(this.getBasicInfo(commonEmployee) + ", job:" + commonEmployee.getJob());
    }

    private String getBasicInfo(Employee employee) {
        return "name：" + employee.getName() + ", salary:" + employee.getSalary();
    }

}
