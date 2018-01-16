package cn.com.song.design.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortDecorator extends Decorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(SortDecorator.class);

    public SortDecorator(SchoolReport realSchoolReport) {
        super(realSchoolReport);
    }

    private void reportSort() {
        LOGGER.info("班级排名25");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
