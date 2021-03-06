package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.sum.apply(1, 2);
        int b = calculator.subtract.apply(1,1);
        int c = calculator.divide.apply(a, b);//При условии(num2 == 0) выбрасывается ArithmeticException;
        //Варианты решения: добавление тернарного оператора/блока кода в лямбда-выражение для создания условия возврата значения;
        //Т.к "divide" возвращает тип Integer, то если делитель равен 0, метод вернет -1(как exit code), который можно использовать для вывода ошибки;
        if (c == -1) {
            System.out.println("- Error: You can't divide by zero!");
        } else {
            calculator.println.accept(c);
        }
    }
}