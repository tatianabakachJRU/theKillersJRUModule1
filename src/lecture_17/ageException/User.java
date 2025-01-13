package lecture_17.ageException;

public class User {
    String name;
    int age;

    public User(String name, int age) throws AgeInvalidException {
        this.name = name;
        setAge(age);
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

    public void setAge(int age) throws AgeInvalidException {
        if(age < 0 || age >= 150){
            throw new AgeInvalidException("Age must be between 0 and 150 years");
        }
        this.age = age;
    }
}
