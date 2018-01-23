package cn.com.song.design.pattern.state;

public abstract class AbstractLiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void run();

    public abstract void stop();

    public abstract void close();

}
