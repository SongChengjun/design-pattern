package cn.com.song.design.pattern.Chain;

public class Husband extends AbstractHandler {

    public Husband(Level level) {
        super(level);
    }

    @Override
    public Response handleRequest(Request request) {
        return new Response().setResult("丈夫同意");
    }
}
