package robot.hands;

public class SamsungHand implements IHand {
    private String model = "Samsung";
    private int price;
    public static final int UP_PRICE_BORDER = 2000;
    public static final int DOWN_PRICE_BORDER = 1500;

    public SamsungHand(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public SamsungHand() {
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
