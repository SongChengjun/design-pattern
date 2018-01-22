package cn.com.song.design.pattern.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LetterProcessImpl implements ILetterProcess {

    private final static Logger LOGGER = LoggerFactory.getLogger(LetterProcessImpl.class);

    @Override
    public void writeContext(String msg) {
        LOGGER.info(msg);

    }

    @Override
    public void fillEnvelope(String address) {
        LOGGER.info(address);
    }

    @Override
    public void letterIntoEnvelope() {
        LOGGER.info("装进信封...");
    }

    @Override
    public void sendLetter() {
        LOGGER.info("邮递...");
    }
}
