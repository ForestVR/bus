public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public boolean zijnGelijk (Dog dog, Cat cat) {
        return dog.equals(cat);
    }

    public boolean zijnGelijk (Dog dog, Dog dog2) {
        return (dog2.equals(dog2));
    }
}