package lecture_16;

public class L16_Example_6 {
    public static void main(String[] args) {
        try{
            //int result = devide(10, 0); // Arithmetic
            String str = null;
            System.out.println(str.length()); // NullPointer
        } catch (ArithmeticException | NullPointerException | NumberFormatException exception){
            System.out.println("Exception message: " + exception.getMessage());
        }
    }

    public static int devide(int a, int b){
        return a/b;
    }
}
