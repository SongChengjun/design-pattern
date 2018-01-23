package cn.com.song.design.pattern.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * 享元模式(使用共享对象可有效地支持大量细粒度的对象)
 *
 * 优点：大大减少对象的创建，降低内存占用，增强性能
 * 缺点：线程安全问题
 *
 * 可以参考Apache的common-pool对象池组件
 *
 * @author cjsong@ronglian.com
 * @date 2018/01/23 22:15
 */
public class SignInfoFactory {

    private final static Logger LOGGER = LoggerFactory.getLogger(SignInfoFactory.class);

    private HashMap<String, SignInfo> pool = new HashMap<>(16);

    public SignInfo getSignInfo(String key) {
        SignInfo result;

        if (this.pool.containsKey(key)) {
            LOGGER.info("直接从对象池中获取...");
            result = pool.get(key);
        } else {
            LOGGER.info("创建新对象，并放入对象池中...");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        }

        return result;
    }


}
