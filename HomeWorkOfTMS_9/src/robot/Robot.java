package robot;

import robot.hands.IHand;
import robot.heads.IHead;
import robot.legs.ILeg;

public class Robot implements IRobot {
    private String name = "инв. №1546....(имя не присвоено)";
    private IHand hand;
    private IHead head;
    private ILeg leg;

    public Robot(String name, IHand hand, IHead head, ILeg leg) {
        this.name = name;
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public Robot() { }

    public IHand getHand() { return hand; }
    public void setHand(IHand hand) { this.hand = hand; }
    public IHead getHead() { return head; }
    public void setHead(IHead head) { this.head = head; }
    public ILeg getLeg() { return leg; }
    public void setLeg(ILeg leg) { this.leg = leg; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public void action() {
        if (hand == null || head == null || leg == null){
            System.out.println("Робот не укомплектован. Поэтому мы не можем его запустить.");
            return;
        }

        System.out.println("Внимание...Производиться запуск робота " + name);
        head.speak();
        System.out.println("*****");
        hand.upHand();
        System.out.println("*****");
        leg.step();
    }

    @Override
    public int getPrice() {
        if (hand == null || head == null || leg == null){
            System.out.println("Робот не укомплектован. Поэтому итоговая цена не известна");
            return 0;
        }

        return hand.getPrice() + head.getPrice() + leg.getPrice();
    }
}
