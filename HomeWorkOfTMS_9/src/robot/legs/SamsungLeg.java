package robot.legs;

import java.util.Random;

public class SamsungLeg implements ILeg {
    private String model = "Samsung";
    private int price;
    public static final int UP_PRICE_BORDER = 2250;
    public static final int DOWN_PRICE_BORDER = 1800;
    Random random = new Random();

    public SamsungLeg(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public SamsungLeg() {
        price = DOWN_PRICE_BORDER;
    }

    @Override
    public void step() {
        System.out.println("Проверяю системы амартизаци, пневматику от фирмы " + model);
        System.out.println("Отрываю стопу от земли, сгибаю колено... ");
        doStep();
    }

    private void doStep() {
        if (random.nextInt(10) < 3) System.out.println("Делаю шаг. У нас получилось... Сам в шоке.");
        else System.out.println("Ногу заклинило, такое случается. Простите, мы совсем недавно в этом бизнесе.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
