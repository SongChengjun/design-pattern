package cn.com.song.design.pattern.visitor;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void visit() throws Exception {
        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.setName("songchengjun");
        commonEmployee.setSalary(10000);
        commonEmployee.setJob("programmer");

        ManagerEmployee managerEmployee = new ManagerEmployee();
        managerEmployee.setName("chenLi");
        managerEmployee.setSalary(30000);
        managerEmployee.setPerformance("Great");

        IVisitor visitor = new Visitor();

        commonEmployee.accept(visitor);
        managerEmployee.accept(visitor);
    }

}