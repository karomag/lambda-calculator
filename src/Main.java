public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1); // result is 0
        int c = calc.divide.apply(a, b); // errror / by zero

        calc.println.accept(c);
    }
}