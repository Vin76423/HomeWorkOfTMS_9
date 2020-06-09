package calculator;

import java.util.Objects;
import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("\n");
            Operation operation = getOperation();
            if (operation == null) break;

            int a = getNumber("Введите переменную \"a\":");
            int b = getNumber("Введите переменную \"b\":");

            if (operation.toString().equals("Division") && b == 0) {
                System.out.println("На ноль делить нельзя. Попробуйте еще раз.");
                continue;
            }

            operation.calculate(a,b);
        }
    }

    private void showMenu() {
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        System.out.println("0 - выход");
    }

    private Operation getOperation() {
        System.out.println("Выберите действие:");
        showMenu();
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: return new Addition();
            case 2: return new Subtraction();
            case 3: return new Multiplication();
            case 4: return new Division();
            case 0: return null;
        }

        System.out.println("Нет такого действия. Повторите ввод.");
        return getOperation();
    }

    private int getNumber(String massage) {
        System.out.println(massage);
        return scanner.nextInt();
    }
}
