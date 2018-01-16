package cn.com.song.design.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThirdGradeSchoolReport extends SchoolReport {

    private static final Logger LOGGER = LoggerFactory.getLogger(ThirdGradeSchoolReport.class);

    @Override
    public void report() {
        LOGGER.info("语文 59   数学 80   自然 63  体育 98");
    }

    @Override
    public void sign(String name) {
        LOGGER.info("家长名字：" + name);
    }
}
