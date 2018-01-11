package cn.com.song.design.pattern.builder;


import java.util.ArrayList;

/**
 * @author songchengjun
 * @date 2018/1/11 14:49
*/
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();

    public abstract void start();

    public abstract void alarm();

    public abstract void engineBoom();

    public abstract void stop();

    public final void run() {
        for (int i = 0; i < sequence.size(); i++) {
            if ("start".equalsIgnoreCase(sequence.get(i))) {
                this.start();
            } else if ("alarm".equalsIgnoreCase(sequence.get(i))) {
                this.alarm();
            } else if ("engineBoom".equalsIgnoreCase(sequence.get(i))) {
                this.engineBoom();
            } else if ("stop".equalsIgnoreCase(sequence.get(i))) {
                this.stop();
            }
        }
    }

    protected void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
