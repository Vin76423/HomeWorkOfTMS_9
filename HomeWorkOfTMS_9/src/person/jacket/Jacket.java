package person.jacket;

public class Jacket implements IJacket{
    @Override
    public void upWear() {
        System.out.println("Одеваю куртку");
        System.out.println("Застегиваю молнию");
    }

    @Override
    public void downWear() {
        System.out.println("Снимаю куртку вешаю в шкаф");
    }
}
