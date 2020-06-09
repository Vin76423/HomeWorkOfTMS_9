package person.footwear;

public class Slippers implements IFootwear {
    @Override
    public void upWear() {
        searchMySlippers();
        System.out.println("Переворачиваю ногой опрокинутый тапок");
        System.out.println("Этой же ногой пододвигаю один тапок к другому");
        System.out.println("Одеваю тапки");
    }

    private void searchMySlippers() {
        System.out.println("Ищу то самое место по квартире где оставил свои тапочки...");
    }

    @Override
    public void downWear() {
        System.out.println("Ловким движением сбрасывю тапочки с одной... другой ноги на пол");
    }
}
