package lecture_7;

public class L7_Example_7 {
    public static void main(String[] args)
    {
        staticMethod();
        //nonStaticMethod();
    }

    public static void staticMethod()
    {

    }

    public int nonStaticMethod()
    {

        staticMethod();
        return 19;
    }
}
