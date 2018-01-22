package cn.com.song.design.pattern.visitor;

public interface IVisitor {

    void visit(ManagerEmployee managerEmployee);

    void visit(CommonEmployee commonEmployee);
}
