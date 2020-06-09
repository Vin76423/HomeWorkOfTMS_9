package person.trousers;

import java.util.Random;

public class Trousers implements ITrousers {
    private Random random = new Random();

    @Override
    public void upWear() {
        checkMyTrousers();
        sortBeltForMyTrousers();
        System.out.println("Одеваю брюки");
        System.out.println("Затягиваю ремень");
    }

    private void checkMyTrousers() {
        System.out.println("Проверяю глажены/не глажены брюки...");
        System.out.println(random.nextInt(10) > 4 ? "Брюки - мятые. Глажу брюки." : "Брюки в отличном состоянии." +
                " Гладить не нужно.");
    }

    private void sortBeltForMyTrousers() {
        System.out.println("Ищу ремень для брюк...");
        while (true) {
            if (random.nextInt(10) > 5) break;
            System.out.println("Не могу найти...Ищу дальше...");
        }

        System.out.println("Вот же он!! нашел!");
    }

    @Override
    public void downWear() {
        System.out.println("Снимаю брюки");
        System.out.println("Аккуратно складываю в шкаф");
    }
}
