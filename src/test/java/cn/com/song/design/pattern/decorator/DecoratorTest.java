package cn.com.song.design.pattern.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void sign() throws Exception {
        SchoolReport schoolReport = new ThirdGradeSchoolReport();
        schoolReport = new HighScoreDecorator(schoolReport);
        schoolReport = new SortDecorator(schoolReport);

        schoolReport.report();
        schoolReport.sign("宋成君");

    }

}