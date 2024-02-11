package kazan.kamilia.caculator._main;


import kazan.kamilia.caculator.util.Calculator;

public class _Main {
    public static void main(String[] args){
        int result = Calculator.calculateSum(50, 10);
        int result2 = Calculator.calculateMult(50, 10);
        int result3 = Calculator.calculateMult(50, 10);


System.out.println("Сумма: " + result);
System.out.println("Произведение: " + result2);
System.out.println("Вычитание: " + result3);
    }
}
