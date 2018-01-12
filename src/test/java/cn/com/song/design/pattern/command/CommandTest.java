package cn.com.song.design.pattern.command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void execute() throws Exception {
        AddRequirementCommand addRequirementCommand = new AddRequirementCommand();
        DeletePageCommand deletePageCommand = new DeletePageCommand();
        Invoker invoker = new Invoker();

        invoker.setCommand(addRequirementCommand);
        invoker.action();

        invoker.setCommand(deletePageCommand);
        invoker.action();
    }

}