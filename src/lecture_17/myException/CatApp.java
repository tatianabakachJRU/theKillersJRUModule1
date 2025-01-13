package lecture_17.myException;

public class CatApp {
    public static void main(String[] args) {
        try{
            IllegalArgumentException illegalArgumentException
                    = new IllegalArgumentException(
                            "The cat tried to jump on the shelf was to high");

            MyException myException = new MyException(
                    "Exception in the cat application: the cat dont't reach the shelf",
                    illegalArgumentException,
                    false,
                    false
            );
            myException.addSuppressed(new Exception("Exception suppressed"));

            throw myException;
        } catch (MyException ex){
            System.out.println("Message: " + ex.getMessage());
            System.out.println("Cause: " + ex.getCause());
            System.out.println("Suppressed exceptions: ");
            for (Throwable throwable : ex.getSuppressed()) {
                System.out.println("Suppressed: " + throwable.getMessage());
            }
            ex.printStackTrace();
        }
    }
}
