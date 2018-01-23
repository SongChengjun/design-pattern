package cn.com.song.design.pattern.bridge;

/**
 * 修正实例化角色，可以添加自身的属性和行为
 */
public class HouseCorp extends Corp {

    public HouseCorp(HouseProduct house) {
        super(house);
    }

    /**
     * 方法内可以修正实例化角色
     */
    @Override
    public void makeMoney() {
        super.makeMoney();
    }
}
