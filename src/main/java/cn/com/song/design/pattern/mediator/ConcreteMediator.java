package cn.com.song.design.pattern.mediator;

/**
 * @author songchengjun
 * @date 2018/1/12 15:55
*/
public class ConcreteMediator extends Mediator {

    ConcreteColleague1 concreteColleague1;

    ConcreteColleague2 concreteColleague2;

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague instanceof  ConcreteColleague1) {
            concreteColleague2.notify(message);
        } else {
            concreteColleague1.notify(message);
        }

    }
}
