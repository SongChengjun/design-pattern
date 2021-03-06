package cn.com.song.design.pattern.interpreter;

import java.util.HashMap;

/**
 * 终结符表达式
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
