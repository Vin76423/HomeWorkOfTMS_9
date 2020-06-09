package robot.heads;

public class SamsungHead implements IHead {
    private String model = "Samsung";
    private int price;
    public static final int UP_PRICE_BORDER = 20000;
    public static final int DOWN_PRICE_BORDER = 15000;

    public SamsungHead(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public SamsungHead() {
        price = DOWN_PRICE_BORDER;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова марки " + model);
        System.out.println("Я могу разговаривать благодаря изобретательности инженеров нашей компании.");
        System.out.println("Эти ребята приспособили софт и микропроцессоры широкой линейки бытовой техники нашей компании" +
                " для нужд роботостроения");
        System.out.println("Поэтому иногда могу заикаться");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
