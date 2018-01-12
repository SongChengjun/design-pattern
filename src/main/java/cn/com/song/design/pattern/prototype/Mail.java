package cn.com.song.design.pattern.prototype;

/**
 * 原型模式(不通过new关键字来创建对象，而是通过对象复制来实现的模式)
 *
 * 使用场景：对象的创建影响性能、一个对象对应多个修改者
 *
 * @author songchengjun
 * @date 2018/1/12 11:42
*/
public class Mail implements Cloneable {

    String receivers;

    String subject;

    String context;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getSubject();
        this.context = advTemplate.getContext();
    }

    public String getReceivers() {
        return receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 对象浅拷贝:
     *      1.重新分配内存，在内存中以二进制流的形式进行拷贝，构造函数不会执行
     *      2.对象内部的数组以引用对象不会拷贝，会拷贝原始类型int、long、String(字符串常量池)等
     * 对象深拷贝：将浅拷贝对象内部对象分别执行拷贝
     *
     * @return cn.com.song.design.pattern.prototype.Mail
    */
    @Override
    protected Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return mail;
    }
}
