package cn.com.song.design.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * 源对象：你想把谁转换成目标接口
 */
public class OuterUser {

    public Map getUserBaseInfo() {
        Map userBaseInfo = new HashMap();
        userBaseInfo.put("userName", "songchengjun");
        userBaseInfo.put("mobile", "151****0108");
        return userBaseInfo;
    }

    public Map getUserOfficeInfo() {
        Map userOfficeInfo = new HashMap();
        userOfficeInfo.put("jobPosition", "programmer");
        return userOfficeInfo;
    }

}
