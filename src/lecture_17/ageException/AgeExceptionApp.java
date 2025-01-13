package lecture_17.ageException;

public class AgeExceptionApp {
    public static void main(String[] args) {
        try{
            User nik = new User("Nik", 25);
            System.out.println("User: " +  nik.getName() + " Age: " + nik.getAge());

            User alice = new User("Alice", -5);
            System.out.println("User: " +  alice.getName() + " Age: " + alice.getAge());
        } catch (AgeInvalidException ex){
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        } catch (NullPointerException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
