package cn.com.song.design.pattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解释器模式(给定一门语言，定义它的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中的句子)
 *
 * 优点：扩展性
 * 缺点：语法比较复杂时，非终结符表达式会引起类膨胀；该模式采用递归调用方法，会导致调试复杂；大量的递归，会影响效率；不易维护
 *
 * @author cjsong@ronglian.com
 * @date 2018/01/23 21:43
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {
        char[] chars = expStr.toCharArray();

        Stack<Expression> stack = new Stack<>();
        Expression left;
        Expression right;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddSymbolExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubSymbolExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));

            }
        }

        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
