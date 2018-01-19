package cn.com.song.design.pattern.composite;

/**
 * 组合模式(将对象组合成树形结构以表示"整体-部分"的层次结构，使用户对单个对象和组合对象的使用具有一致性)
 *
 * 优点：树形结构中所有节点都是component，局部和整体对调用者来说没有区别
 * 缺点：树枝节点和树叶节点直接使用了实现类
 *
 * @author songchengjun
 * @date 2018/1/19 11:12
*/
public abstract class Corp {

    /**
     * 定义参加组合对象的共有方法和属性
     */
    private String name;

    private String position;

    private int salary;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return "name：" + name + "  position:" + position + " salary:" + salary;
    }

}
