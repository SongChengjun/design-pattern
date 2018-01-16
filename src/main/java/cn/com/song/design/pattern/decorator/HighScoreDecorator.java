package cn.com.song.design.pattern.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighScoreDecorator extends Decorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(HighScoreDecorator.class);

    public HighScoreDecorator(SchoolReport realSchoolReport) {
        super(realSchoolReport);
    }

    private void reportHighScore() {
        LOGGER.info("数学 80  体育 98");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
