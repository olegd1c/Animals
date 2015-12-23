package animal.animals;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void play() {
        System.out.println("fish "+name +" play");
    }

    public void walk() {
        System.out.println("fish "+name +" walk");
    }

    public void eat() {
        System.out.println("fish "+name +" eat");
    }
}
