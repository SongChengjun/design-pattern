package cn.com.song.design.pattern.mediator;

import org.junit.Test;

public class MediatorTest {

    @Test
    public void send() throws Exception {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);

        colleague1.send("SB...");
    }

}