package calculator;

public class Addition implements Operation {

    public Addition() { }

    @Override
    public void calculate(int a, int b) {
        System.out.println("Сумма " + a + " и " + b + " даёт результат: " + (a + b));
    }
}