package robot;

import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

import java.util.Arrays;

public class MainRobot {
    public static void main(String[] args) {
        Robot r1 = new Robot("Mark-1", new SonyHand(2350), new ToshibaHead(35000), new SamsungLeg());
        r1.action();

        System.out.println();

        Robot r2 = new Robot();
        r2.action();
        r2.getPrice();
        System.out.println();
        r2.setHand(new SonyHand(2500));
        r2.setHead(new SonyHead(23500));
        r2.setLeg(new ToshibaLeg());
        r2.action();
        r2.getPrice();
        r2.setName("Jarvis");

        System.out.println();

        Robot r3 = new Robot("Samson", new SamsungHand(2250), new SamsungHead(21000), new SonyLeg(2700));
        r3.action();

        System.out.println();

        Robot theRichestRobot = r1;
        Robot [] robots = {r1, r2, r3};
        for (Robot robot : robots) {
            if (robot.getPrice() > theRichestRobot.getPrice()) theRichestRobot = robot;
        }

        System.out.println("Самым дорогим получился робот по имени - " + theRichestRobot.getName() +
                ", стоимостью - " + theRichestRobot.getPrice() + " $");
    }
}
