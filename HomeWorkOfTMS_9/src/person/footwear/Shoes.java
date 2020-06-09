package person.footwear;

public class Shoes implements IFootwear {
    @Override
    public void upWear() {
        prepareMyShoes();
        System.out.println("Обуваюсь в туфли");
        System.out.println("Завязываю черные (под цвет туфель) шнурки");
    }

    private void prepareMyShoes() {
        System.out.println("Чищу и палерую свои туфли");
        System.out.println("Жду несколько минут пока всохнет крем");
    }

    @Override
    public void downWear() {
        System.out.println("Развязываю шнурки");
        System.out.println("Снимаю туфли туфли");
        System.out.println("Аккуратно кладу на полку");
    }
}
