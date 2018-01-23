package cn.com.song.design.pattern.Chain;

public class women implements Iwomen {

    private Level level;

    private Request request;

    public women(Level level, Request request) {
        this.level = level;
        this.request = request;
    }

    @Override
    public Level getLevel() {
        return level;
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
