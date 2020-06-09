package person;

import person.footwear.IFootwear;
import person.jacket.IJacket;
import person.trousers.ITrousers;

public class Person {
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IFootwear footwear;
    private boolean getDressed = false;

    public Person(String name, IJacket jacket, ITrousers trousers, IFootwear footwear) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.footwear = footwear;
    }

    public Person() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public IJacket getJacket() { return jacket; }
    public void setJacket(IJacket jacket) { this.jacket = jacket; }
    public ITrousers getTrousers() { return trousers; }
    public void setTrousers(ITrousers trousers) { this.trousers = trousers; }
    public IFootwear getFootwear() { return footwear; }
    public void setFootwear(IFootwear footwear) { this.footwear = footwear; }

    public void getDress() {
        if (jacket == null || trousers == null || footwear == null){
            System.out.println(name + " не определился с гардеробом на сегодня");
            return;
        }

        trousers.upWear();
        System.out.println("******");
        jacket.upWear();
        System.out.println("******");
        footwear.upWear();
        System.out.println("******");
        System.out.println(name + " оделся.");

        getDressed = true;
    }

    public void unRobe() {
        if (!getDressed){
            System.out.println(name + " и так не одет");
            return;
        }

        footwear.downWear();
        System.out.println("******");
        jacket.downWear();
        System.out.println("******");
        trousers.downWear();
        System.out.println("******");
        System.out.println(name + " разделся.");
    }
}
