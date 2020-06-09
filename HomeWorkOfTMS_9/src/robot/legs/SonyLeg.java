package robot.legs;

import java.util.Random;

public class SonyLeg implements ILeg {
    private String model = "Sony";
    private int price;
    public static final int UP_PRICE_BORDER = 2750;
    public static final int DOWN_PRICE_BORDER = 2300;
    Random random = new Random();

    public SonyLeg(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public SonyLeg() {
        price = DOWN_PRICE_BORDER;
    }

    @Override
    public void step() {
        System.out.println("Проверяю системы амартизаци, пневматику от фирмы " + model);
        System.out.println("Отрываю стопу от земли, сгибаю колено... ");
        doStep();
    }

    private void doStep() {
        if (random.nextInt(10) > 3) System.out.println("Делаю шаг. Все системы в норме.");
        else System.out.println("Ногу заклинило. Нужна тех. поддержка.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
