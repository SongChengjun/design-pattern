package cn.com.song.design.pattern.strategy;

public class GiveGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
