package cn.com.song.design.pattern.composite;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class CorpTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CorpTest.class);

    @Test
    public void getInfo() throws Exception {
        Branch root = new Branch("songchengjun", "CEO", 100000000);
        Branch developDepartment = new Branch("SB", "CTO", 50000);
        Branch productDepartment = new Branch("2B", "CPO", 30000);

        Leaf coder1 = new Leaf("1", "coder", 10000);
        Leaf coder2 = new Leaf("2", "coder", 10000);
        Leaf coder3 = new Leaf("3", "coder", 10000);

        root.addSubordinate(developDepartment);
        root.addSubordinate(productDepartment);

        developDepartment.addSubordinate(coder1);
        developDepartment.addSubordinate(coder2);
        developDepartment.addSubordinate(coder3);

        LOGGER.info(getTreeInfo(root));

    }

    private String getTreeInfo(Branch root) {
        ArrayList<Corp> subordinateList = root.getSubordinateList();
        String info = "";
        for (Corp subordinate : subordinateList) {
            if (subordinate instanceof Leaf) {
                info = info + subordinate.getInfo() + "\n";
            } else {
                info = info + subordinate.getInfo() + "\n" + getTreeInfo((Branch)subordinate);
            }
        }
        return info;
    }

}