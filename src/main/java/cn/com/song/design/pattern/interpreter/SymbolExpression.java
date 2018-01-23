package cn.com.song.design.pattern.interpreter;

/**
 * 非终结符表达式
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
