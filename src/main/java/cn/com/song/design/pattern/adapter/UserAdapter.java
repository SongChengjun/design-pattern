package cn.com.song.design.pattern.adapter;


import java.util.Map;

/**
 * 适配器模式(使原本因接口不匹配而无法一起工作的两个类能在一起工作)
 *
 * 案例场景：内部系统员工信息对象与外部系统的借聘员工信息对象不一致
 *

 *
 *  @author cjsong@ronglian.com
 *  @date 2018/01/18 21:11
 */
public class UserAdapter extends OuterUser implements IUserInfo {

    private Map baseInfo = super.getUserBaseInfo();

    private Map officeInfo = super.getUserOfficeInfo();

    @Override
    public String getUserName() {
        return (String)this.baseInfo.get("userName");
    }

    @Override
    public String getMobile() {
        return (String)this.baseInfo.get("mobile");
    }

    @Override
    public String getJobPosition() {
        return (String)this.officeInfo.get("jobPosition");
    }
}
