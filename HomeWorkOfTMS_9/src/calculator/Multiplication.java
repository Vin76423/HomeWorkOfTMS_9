package calculator;

public class Multiplication implements Operation {

    public Multiplication() { }

    @Override
    public void calculate(int a, int b) {
        System.out.println("Произведение " + a + " и " + b + " даёт результат: " + (a * b));
    }
}
