package person.trousers;

public class Shorts implements ITrousers {
    @Override
    public void upWear() {
        System.out.println("Беру шерты со спинки стула");
        System.out.println("Одеваю шерты");
    }

    @Override
    public void downWear() {
        System.out.println("Снимаю шерты");
        System.out.println("Вешаю на спинку стула");
    }
}
