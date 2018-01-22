package cn.com.song.design.pattern.facade;

/**
 * 门面模式(一个子系统的外部与内部的通信必须通过一个统一的对象进行)
 *   ModenPostOffice为门面对象，没有实际的业务逻辑而是将请求委派到相应的子系统
 *   LetterProcessImpl为子系统
 *
 *  使用场景：为一个复杂模块或子系统提供一个供外界访问的接口；子系统相对独立，外界对子系统的访问只要黑箱操作即可
 *
 *  @author cjsong@ronglian.com
 *  @date 2018/01/22 21:22
 */
public class ModenPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String msg, String address) {
        this.letterProcess.writeContext(msg);
        this.letterProcess.fillEnvelope(address);
        this.letterProcess.letterIntoEnvelope();
        this.letterProcess.sendLetter();
    }

}
