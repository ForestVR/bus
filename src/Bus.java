import java.util.HashMap;

public class Bus {

    private Driver driver;
    private HashMap<String, Mens> stoelen = new HashMap<>();

    public Bus(Driver driver) {
        this.driver = driver;
    }

    public void instappen(Mens mens1, Mens mens2, Mens mens3) {
        instappen(mens1);
        instappen(mens2);
        instappen(mens3);
        //this.stoelen[1] = kind1;    showInfo(kind1);
        //this.stoelen[2] = kind2;    showInfo(kind2);
        //this.stoelen[3] = kind3;    showInfo(kind3);
    }


 //   public int vrijePlek() {
   //    for (int i =0; i < stoelen.size(); i++) {
    //       if (stoelen[i] == null)
    //           return i;
  //     }
 //       return -1;
 //   }

    public void instappen(Mens mens) {

        String key = mens.getName();
        Mens value = mens;
        this.stoelen.put(key, value);
        showInfo(mens, " is ingestapt");
    }

    private int getMensCount() {
        return stoelen.size();
    }

    private void showInfo(Mens mens, String actie) {
        System.out.println(mens.getName()+ actie);
    }

    public Mens uitstappen(String name) {

            if (!stoelen.containsKey(name)) {
                System.out.println(name + " zit niet in de bus.");
                return null;
            }
            Mens uitgestapte = stoelen.get(name);
            stoelen.remove(name);
            showInfo(uitgestapte, " is uitgestapt.");
            return uitgestapte;
    }

    public String toString() {
        return "Er zitten " +getMensCount()+" mensen in de bus";
    }
}
