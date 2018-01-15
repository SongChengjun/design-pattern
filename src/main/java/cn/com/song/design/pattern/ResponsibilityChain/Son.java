package cn.com.song.design.pattern.ResponsibilityChain;

public class Son extends AbstractHandler {

    public Son(Level level) {
        super(level);
    }

    @Override
    public Response handleRequest(Request request) {
        return new Response().setResult("儿子同意");
    }
}
