package cn.com.song.design.pattern.memento;

/**
 * 备忘录模式(在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便于恢复对象之前的状态)
 *
 * Memento备忘录对象，用于保存和恢复数据
 *
 * 使用场景：需要提供一个可回滚的操作；需要保存和恢复数据的相关状态场景；数据库连接的事务管理用的就是备忘录模式
 *
 * 注意事项：备忘录对象创建出来就要在最近的代码中使用，主动管理它的生命周期；不要在频繁建立备份的场景中使用
 *
 * @author cjsong@ronglian.com
 * @date 2018/01/22 21:22
 */
public class Memento {

    private String status = "";

    public Memento(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
