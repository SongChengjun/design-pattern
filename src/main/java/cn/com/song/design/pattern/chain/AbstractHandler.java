package cn.com.song.design.pattern.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 责任链模式(使多个对象都有机会处理请求，从而避免请求者与处理者之间的耦合关系，将这些对象连成一条链，并沿着这条链传递请求)
 *
 * 案例场景：女子三从---未嫁从父，即嫁从夫，夫死从子
 * 优点：将请求和处理分开
 * 缺点：处理链条较长会带来性能问题；调试不方便；需要控制链条长度
 *
 *
 * @author songchengjun
 * @date 2018/1/11 16:09
 */
public abstract class AbstractHandler {

    private final static Logger LOGGER = LoggerFactory.getLogger(AbstractHandler.class);

    private AbstractHandler nextHandler;

    private Level level;

    public AbstractHandler(Level level) {
        this.level = level;
    }

    /**
     * 模板方法模式
     * @param women
     * @return
     */
    public final Response handlerChain(Iwomen women) {
        if (women.getLevel() == this.level) {
            return this.handleRequest(women.getRequest());
        } else {
            if (nextHandler != null) {
                return this.nextHandler.handlerChain(women);
            } else {
                LOGGER.warn("没有责任人处理...");
                return new Response();
            }
        }
    }

    public abstract Response handleRequest(Request request);

    public void setHandle(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
