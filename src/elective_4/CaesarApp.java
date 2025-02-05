package elective_4;

import java.util.Scanner;

public class CaesarApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();
        CaesarCipher caesarCipher = new CaesarCipher();

        while (true){
            System.out.println("/nВыберите пункт меню:");
            System.out.println("1.Зашифровать текст");
            System.out.println("2.Расшифровать текст");
            System.out.println("3.Расшифровать текст Brute force");
            System.out.println("4.Выход");
            System.out.print("Ваш выбор: ");

            int choice = Integer.parseInt(scanner.nextLine());


            switch (choice){
                case 1:
                    System.out.print("Введите путь к файлу: ");
                    String fileEncryptPath = scanner.nextLine();
                    System.out.print("Ключ:");
                    int keyEncrypt = Integer.parseInt(scanner.nextLine());
                    if(validator.isKeyValid(keyEncrypt) && validator.isFileExist(fileEncryptPath)){
                        // логика по зашифровке
                        caesarCipher.encrypt(fileEncryptPath, keyEncrypt);
                    }
                case 2:

                case 3:

                case 4:
                    return;

                default:
                    System.out.println("Вы сделали не верный выбор. Еще раз.");
            }

        }
    }
}
