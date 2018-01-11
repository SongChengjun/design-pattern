package cn.com.song.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author songchengjun
 * @date 2018/1/11 17:07
*/
public class GamePlayerInvocationHandler implements InvocationHandler {

    private Object proxy;

    public GamePlayerInvocationHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.proxy, args);
    }
}
