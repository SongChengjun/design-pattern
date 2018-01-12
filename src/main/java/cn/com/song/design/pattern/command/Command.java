package cn.com.song.design.pattern.command;

/**
 * 命令模式(只要认为是命令的地方就可以采用命令模式)
 *
 * @author songchengjun
 * @date 2018/1/12 17:07
*/
public abstract class Command {
    /**
     * 将所有的命令实际执行者初始化在Command，因为单个命令可能需要多个执行者协作完成
     */
    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected UIGroup uiGroup = new UIGroup();

    protected CodeGroup codeGroup =  new CodeGroup();

    public abstract void execute();

}
