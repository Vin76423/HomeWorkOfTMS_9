package robot.heads;

public class ToshibaHead implements IHead {
    private String model = "Toshiba";
    private int price;
    public static final int UP_PRICE_BORDER = 37000;
    public static final int DOWN_PRICE_BORDER = 30000;

    public ToshibaHead(int price) {
        if (price > UP_PRICE_BORDER) this.price = UP_PRICE_BORDER;
        else if (price < DOWN_PRICE_BORDER) this.price = DOWN_PRICE_BORDER;
        else this.price = price;
    }

    public ToshibaHead() {
        price = DOWN_PRICE_BORDER;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова марки " + model);
        System.out.println("В моей голове микросхемы и процессоры компании \"Toshiba Machine Industrial Robots\".");
        System.out.println("Это мировой лидер в области роботостроения, производит комплектующие для всех типов роботов.");
        System.out.println("Поэтому я умею говорить на всех языках мира, петь, и воспроизводить звуки всех существующих животных");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
