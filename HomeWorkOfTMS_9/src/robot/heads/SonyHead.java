package robot.heads;

public class SonyHead implements IHead{
    private String model = "Sony";
    private int price;
    public static final int UP_PRICE_BORDER = 25000;
    public static final int DOWN_PRICE_BORDER = 20000;

    public SonyHead(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public SonyHead() {
        price = DOWN_PRICE_BORDER;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова марки " + model);
        System.out.println("Я могу разговаривать благодаря ОС \"Aperios\", разработанной " +
                "в научно-исследовательском центре Пало-Альто");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
