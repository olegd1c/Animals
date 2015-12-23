package animal.animals;

public class Cat extends Animal implements Pet {

    private String name;

    public Cat(String n) {
         super(4);
         name = n;       
    }
 
    public Cat() {
        super(4); 
        name = "fluffy";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void play() {
        System.out.println("Cat "+name +" play");
    }

    public void eat() {
        System.out.println("Cat "+name +" eat mouse");
    }
}
