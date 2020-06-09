package robot.legs;

public class ToshibaLeg implements ILeg {
    private String model = "Toshiba";
    private int price;
    public static final int UP_PRICE_BORDER = 4100;
    public static final int DOWN_PRICE_BORDER = 3400;

    public ToshibaLeg(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public ToshibaLeg() {
        price = DOWN_PRICE_BORDER;
    }

    @Override
    public void step() {
        System.out.println("Проверяю системы амартизаци, пневматику от фирмы " + model);
        System.out.println("Отрываю стопу от земли, сгибаю колено... ");
        System.out.println("Делаю шаг. Все системы в норме.");
        System.out.println("Компания " + model + " уже много лет на рынке и гарантирует 100%-ое качество");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
