package person;

import person.footwear.Shoes;
import person.footwear.Slippers;
import person.footwear.Sneakers;
import person.jacket.Coat;
import person.jacket.Jacket;
import person.jacket.JeanJacket;
import person.trousers.Shorts;
import person.trousers.Sweatpants;
import person.trousers.Trousers;

import java.util.Arrays;

public class MainPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Oliver", new Coat(), new Trousers(), new Shoes());
        p1.getDress();
        p1.unRobe();

        System.out.println("\n");

        Person p2 = new Person();
        p2.setName("Jake");
        p2.getDress();
        p2.unRobe();
        p2.setFootwear(new Sneakers());
        p2.setTrousers(new Sweatpants());
        p2.setJacket(new JeanJacket());
        p2.getDress();
        p2.unRobe();

        System.out.println("\n");

        Person p3 = new Person("Andy", new Jacket(), new Shorts(), new Slippers());
        p3.unRobe();
        p3.getDress();
        p3.unRobe();
    }
}
