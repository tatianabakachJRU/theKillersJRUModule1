package lecture_10;

public class Cat {

    private String name = "MyCat";
    private int age;

    //1
    public Cat() {
    }

    //2
    public Cat(String name)
    { //Boris
        this.name = name; // Boris  = Boris
    }

    //3
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello from constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Cat eats!!!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
