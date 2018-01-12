package cn.com.song.design.pattern.command;

/**
 * @author songchengjun
 * @date 2018/1/12 17:14
*/
public class AddRequirementCommand extends Command {
    @Override
    public void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
    }
}
