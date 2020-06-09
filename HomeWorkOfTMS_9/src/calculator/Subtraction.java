package calculator;

public class Subtraction implements Operation {

    public Subtraction() { }

    @Override
    public void calculate(int a, int b) {
        System.out.println("Разность " + a + " и " + b + " даёт результат: " + (a - b));
    }
}
