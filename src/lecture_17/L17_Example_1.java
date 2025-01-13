package lecture_17;

public class L17_Example_1 {
    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (RuntimeException ex){
            ex.printStackTrace();
            StackTraceElement[] stackTrace = ex.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                System.out.println("Module: " + element.getModuleName());
                System.out.println("File: " + element.getFileName());
                System.out.println("Class: " + element.getClassName());
                System.out.println("Method: " + element.getMethodName());
                System.out.println("Line: " + element.getLineNumber());
                System.out.println("*".repeat(15));
            }
        }
    }

    public static void methodThatThrowsException(){
        throw new RuntimeException("This is exception message");
    }
}
