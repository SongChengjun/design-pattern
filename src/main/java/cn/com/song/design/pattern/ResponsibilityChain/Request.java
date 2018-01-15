package cn.com.song.design.pattern.ResponsibilityChain;

public class Request {

    String param;

    public Request(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
