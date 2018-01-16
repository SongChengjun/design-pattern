package cn.com.song.design.pattern.decorator;

/**
 *
 */
public abstract class SchoolReport {
    /**
     * 真实成绩单
     * @return
     */
    public abstract void report();

    /**
     * 家长签字
     */
    public abstract void sign(String name);

}
