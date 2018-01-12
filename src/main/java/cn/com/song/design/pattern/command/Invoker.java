package cn.com.song.design.pattern.command;

/**
 * @author songchengjun
 * @date 2018/1/12 17:18
*/
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }

}
