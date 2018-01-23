package cn.com.song.design.pattern.state;

/**
 * 状态模式(当一个对象内在状态发生改变时允许其改变行为，这个对象看起来像改变了其类)
 *  核心是封装，状态的变更引起了行为的变更
 *
 * 优点：遵循设计原则(开闭原则、单一职责原则)；结构清晰(避免过多使用switch...case或if...else)；封装状态和行为的变换
 * 缺点：状态子类膨胀
 *
 * @author songchengjun
 * @date 2018/1/23 17:33
*/
public class Context {

    public static final OpenningState OPENNING_STATE = new OpenningState();

    public static final RunningState RUNNING_STATE = new RunningState();

    public static final StoppingState STOPPING_STATE = new StoppingState();

    public static final ClosingState CLOSING_STATE = new ClosingState();

    private AbstractLiftState liftState;

    public AbstractLiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(AbstractLiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

    public void close() {
        this.liftState.close();
    }
}
