public class Dog {
    private boolean head = true;
    private boolean tail = true;
    private String name;

    public Dog(String name) {
    }

    public boolean hasHead(){
        return this.head;
    }

    public boolean hasTail() {
        return this.tail;
    }

    public boolean equals (Cat cat) {
        return (cat.hasHead() == this.hasHead()
                && cat.hasTail() == this.hasTail());
    }

    public String getName() {
        return this.name;
    }
}
