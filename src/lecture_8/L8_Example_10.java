package lecture_8;

public class L8_Example_10 {
    public static void main(String[] args)
    {
        String str = "Hello";
        for (int i = 0; i < 5; i++)
        {
            str += " world"; // создается новый объект в String Pool = 6 объектов
        }
        System.out.println(str);


        StringBuilder helloSB = new StringBuilder("Hello");

        for (int i = 0; i < 5; i++) {
            helloSB.append(" world"); // не создает новые объекты, а меняет строку = 1 объект
        }

        System.out.println(helloSB);
    }


}
