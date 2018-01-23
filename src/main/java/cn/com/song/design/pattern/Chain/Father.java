package cn.com.song.design.pattern.Chain;

public class Father extends AbstractHandler {

    public Father(Level level) {
        super(level);
    }

    @Override
    public Response handleRequest(Request request) {
        return new Response().setResult("父亲同意");
    }
}
