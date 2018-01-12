package cn.com.song.design.pattern.mediator;

/**
 * @author songchengjun
 * @date 2018/1/12 15:52
*/
public abstract class Colleague {

    /**
     * 不写默认package 同一个包下面的类可以访问
     * protected：可以被不同包中的子类访问
     */
    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message){
        this.mediator.send(message, this);
    }

    public abstract void notify(String message);
}
