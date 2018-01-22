package cn.com.song.design.pattern.facade;

/**
 *
 *  @author cjsong@ronglian.com
 *  @date 2018/01/22 21:15
 */
public interface ILetterProcess {

    /**
     * 写信
     * @param msg
     */
    void writeContext(String msg);

    /**
     * 填写信封
     * @param address
     */
    void fillEnvelope(String address);

    /**
     * 把信装进信封
     */
    void letterIntoEnvelope();

    /**
     * 邮递信件
     */
    void sendLetter();

}
