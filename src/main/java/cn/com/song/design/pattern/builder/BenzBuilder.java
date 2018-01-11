package cn.com.song.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author songchengjun
 * @date 2018/1/11 15:00
*/
public class BenzBuilder extends CarBuilder {

    private BenzModel benzModel = new BenzModel();

    public CarModel getCarModel() {
        return benzModel;
    }

    public void setSequence(ArrayList sequence) {
        benzModel.setSequence(sequence);
    }
}
