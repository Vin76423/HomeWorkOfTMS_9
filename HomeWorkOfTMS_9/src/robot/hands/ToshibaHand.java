package robot.hands;

public class ToshibaHand implements IHand {
    private String model = "Toshiba";
    private int price;
    public static final int UP_PRICE_BORDER = 3700;
    public static final int DOWN_PRICE_BORDER = 3000;

    public ToshibaHand(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public ToshibaHand() {
        price = DOWN_PRICE_BORDER;
    }

    @Override
    public void upHand() {
        System.out.println("Хватаю предмет руками от фирмы " + model);
    }

    @Override
    public int getPrice() {
        return price;
    }
}
