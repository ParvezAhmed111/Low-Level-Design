package designPatterns.structuralDesignPatterns.c_compositeDP.Calculator_or_ArithmeticExpression;

public class Main {
    public static void main(String[] args) {
        ArithmeticExpression one = new Number(1);
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExpression = new Expression(one, seven, Operation.ADD);
        ArithmeticExpression parentExpression = new Expression(two, addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());

    }
}


/*
    2 * (1+7)

             *
          /     \
         2       +
              /     \
              1     7

*/