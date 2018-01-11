package cn.com.song.design.pattern.builder;

import java.util.ArrayList;

/**
 * @author songchengjun
 * @date 2018/1/11 15:01
*/
public class BMWBuilder extends CarBuilder {

    private  BMWModel model = new BMWModel();

    public CarModel getCarModel() {
        return model;
    }

    public void setSequence(ArrayList sequence) {
        model.setSequence(sequence);
    }
}
