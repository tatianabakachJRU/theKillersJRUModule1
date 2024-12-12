package lecture_10;

import java.util.Objects;

public class Dog{

    private String name;
    private int age;


    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;
        return
                age == dog.age
                        &&
                        name.equals(dog.name);
//                        Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() { // от -2млрд до 2млдр
        int result = Objects.hashCode(name); // 55
        result = 31 * result + age; // 31 * 55 + 12
        return result; // 35234
    }


}
