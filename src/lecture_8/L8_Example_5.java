package lecture_8;

public class L8_Example_5
{
    public static int number = 10;

    public static void main(String[] args)
    {
        number = 45;
        int number = 5;

        System.out.println("Локальная переменная метода: " + number);
        System.out.println("Глобальная переменная класса: " + L8_Example_5.number);
    }
}
