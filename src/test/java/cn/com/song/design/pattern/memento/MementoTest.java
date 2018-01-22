package cn.com.song.design.pattern.memento;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MementoTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(MementoTest.class);

    @Test
    public void restore() throws Exception {
        TransactionStatus transactionStatus = new TransactionStatus();
        transactionStatus.setStatus("REQUIRE-NEW");
        LOGGER.info(transactionStatus.getStatus());

        Caretaker caretaker = new Caretaker(transactionStatus.createMemento());

        transactionStatus.suspend();
        LOGGER.info(transactionStatus.getStatus());

        transactionStatus.restore(caretaker.getMemento());
        LOGGER.info(transactionStatus.getStatus());


    }

}