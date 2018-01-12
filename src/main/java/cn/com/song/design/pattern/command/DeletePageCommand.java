package cn.com.song.design.pattern.command;

/**
 * @author songchengjun
 * @date 2018/1/12 17:15
*/
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.uiGroup.find();
        super.uiGroup.delete();

        super.codeGroup.find();
        super.codeGroup.delete();
    }
}
