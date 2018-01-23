package cn.com.song.design.pattern.Chain;

public enum Level {

    FATHER_LEVEL("女儿"), HANSBAN_LEVEL("妻子"), SON_LEVEL("母亲");

    private String type;


    Level(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
