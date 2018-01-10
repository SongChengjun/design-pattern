package cn.com.song.design.pattern.factory;

/**
 * @author: cjsong@ronglian.com 
 * @date: 2018/1/10 15:32
*/
public class HumanFactory extends AbstractHumanFactory {

    @Override
    public <T extends Human> T createHuman(Class<T> humanClass) {
        Human human = null;
        try {
            human = (T)Class.forName(humanClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }

    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();

        Human black = humanFactory.createHuman(BlackHuman.class);
        black.getColor();
        black.talk();

        Human white = humanFactory.createHuman(WhiteHuman.class);
        white.getColor();
        white.talk();
    }

}
