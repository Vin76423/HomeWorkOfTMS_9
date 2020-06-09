package person.jacket;

public class JeanJacket implements IJacket {
    @Override
    public void upWear() {
        checkMyJeanJacket();
        System.out.println("Одиваю джинсовку");
        System.out.println("Застегиваю молнию");
    }

    private void checkMyJeanJacket() {
        System.out.println("Проверяю не осталось ли на моей джинсовой куртке пятен с предыдущей тусовки");
    }

    @Override
    public void downWear() {
        System.out.println("Снимаю куртку, бросаю на полку");
    }
}
