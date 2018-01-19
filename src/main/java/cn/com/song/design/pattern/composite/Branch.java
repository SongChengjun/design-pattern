package cn.com.song.design.pattern.composite;

import java.util.ArrayList;

/**
 * 组织树枝节点和叶子节点形成一个树形结构
 *
 * @author songchengjun
 * @date 2018/1/19 13:35
*/
public class Branch extends Corp {

    private ArrayList<Corp> subordinateList = new ArrayList<Corp>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinateList() {
        return this.subordinateList;
    }

}
