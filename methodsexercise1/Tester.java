package methodsexercise1;

public class Tester {

    public static void main(String args[]) {

        Calculator calculator = new Calculator();

        int number1 = 12, number2 = 8, number3 = 15;

        System.out.printf("%.2f", calculator.findAverage(number1, number2, number3));
    }
}
