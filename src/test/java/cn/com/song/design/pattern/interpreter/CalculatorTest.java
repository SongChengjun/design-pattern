package cn.com.song.design.pattern.interpreter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class CalculatorTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(CalculatorTest.class);

    @Test
    public void run() throws Exception {
        HashMap<String, Integer> var = new HashMap<>();
        var.put("a", 1);
        var.put("b", 1);

        Calculator calculator = new Calculator("a+b");
        LOGGER.info("a+b=" + calculator.run(var));
    }

}