package cn.com.song.design.pattern.interpreter;

import java.util.HashMap;

public class SubSymbolExpression extends SymbolExpression {

    public SubSymbolExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
