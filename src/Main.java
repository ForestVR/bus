public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Kees");
        //Dog henk = new Dog();
        //Dog hondvandebuurvrouw = new Dog();
        //Cat katvandebuurvrouw = new Cat();

        //System.out.println(driver.zijnGelijk(henk, katvandebuurvrouw));
       // System.out.println(driver.zijnGelijk(henk, hondvandebuurvrouw));
       // System.out.println(driver.zijnGelijk(henk, henk));

        Bus bus = new Bus(driver);
        System.out.println(bus);

        Schoolkind kwik = new Schoolkind("Kwik");
        Schoolkind kwek = new Schoolkind("Kwek");
        Schoolkind kwak = new Schoolkind("Kwak");

        bus.instappen(kwik, kwek, kwak);
        System.out.println(bus);

        Schoolkind andries = new Schoolkind("Andries");
        bus.instappen(andries);
        System.out.println(bus);

        OudeMeneer dagobert = new OudeMeneer("Dagobert");
        bus.instappen(dagobert);
        System.out.println(bus);

        Mens uitgestapte = bus.uitstappen("Kwik");
        bus.uitstappen("Kwik");


        System.out.println(bus);
    }
}
