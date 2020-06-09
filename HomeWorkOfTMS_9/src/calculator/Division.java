package calculator;

public class Division implements Operation {

    public Division() { }

    @Override
    public void calculate(int a, int b) {
        System.out.println("Деление " + a + " на " + b + " даёт результат: " + (double) a / b);
    }

    @Override
    public String toString() {
        return "Division";
    }
}
