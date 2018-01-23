package cn.com.song.design.pattern.interpreter;

import java.util.HashMap;

/**
 * 抽象解释器
 */
public abstract class Expression {

    public abstract int interpreter(HashMap<String, Integer> var);

}
