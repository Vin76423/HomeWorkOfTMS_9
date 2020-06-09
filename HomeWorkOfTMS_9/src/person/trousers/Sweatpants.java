package person.trousers;

import java.util.Random;

public class Sweatpants implements ITrousers {
    private Random random = new Random();

    @Override
    public void upWear() {
        sortMySweatpants();
        System.out.println("Лениво натягиваю спортивные штаны");
    }

    private void sortMySweatpants() {
        System.out.println("Ищу мои спортивные штаны в куче повседневной одежды...");
        while (true) {
            if (random.nextInt(10) > 3) break;
            System.out.println("Не могу найти...Ищу дальше...");
        }

        System.out.println("Вот же они, рядом с носками!! нашел!");
    }

    @Override
    public void downWear() {
        System.out.println("Снимаю спортивные штаны, вешаю на спинку кровати");
    }
}
