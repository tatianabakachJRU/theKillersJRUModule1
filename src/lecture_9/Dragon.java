package lecture_9;

public class Dragon {
    private String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public Dragon() {
    }


    public Dragon(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fly(){
        System.out.println("Dragon " + name + " flies!!!!");
        Dragon dragon = new Dragon();
    }
}
