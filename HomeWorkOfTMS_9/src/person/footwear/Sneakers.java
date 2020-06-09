package person.footwear;

public class Sneakers implements IFootwear {
    @Override
    public void upWear() {
        prepareMyShoes();
        System.out.println("Обуваюсь в красовки");
        System.out.println("Завязываю ярко красные шнурки");
    }

    private void prepareMyShoes() {
        System.out.println("Быстро протираю мои красовки сухой тряпкой");
    }

    @Override
    public void downWear() {
        System.out.println("Снимаю красовки");
        System.out.println("Небрежно бросаю на пол");
    }
}
