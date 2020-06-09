package person.jacket;

public class Coat implements IJacket{
    @Override
    public void upWear() {
        checkMyCoat();
        System.out.println("Одеваю пальто");
        System.out.println("Застегиваю пуговицы");
        System.out.println("Поправляю воротник");
    }

    private void checkMyCoat() {
        System.out.println("Проверяю состояние моего польто, все ли пуговицы на месте и т.д.");
    }

    @Override
    public void downWear() {
        System.out.println("Снимаю пальто");
        System.out.println("Акурратно вешаю на вешалку в прихожей");
    }
}
