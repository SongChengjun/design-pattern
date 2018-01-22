package cn.com.song.design.pattern.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 访问者模式()
 *
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
