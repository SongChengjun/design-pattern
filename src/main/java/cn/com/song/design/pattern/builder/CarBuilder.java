package cn.com.song.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author songchengjun
 * @date 2018/1/11 14:57
*/
public abstract class CarBuilder {

    public abstract CarModel getCarModel();

    public abstract void setSequence(ArrayList sequence);

}
