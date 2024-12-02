package elective_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//А если написать и разобрать игру "Виселица", её советуют в книжках,
// при прохождении начального уровня.
//Цель игры:
//        Угадать слово, загаданное программой, называя буквы по одной.
//Ход игры:
//Игра начинается с отображения пустых мест для каждой буквы слова
// (например, "_ _ _ _" для слова из 4 букв).
//Игрок предлагает буквы. Если буква есть в слове, она открывается во
// всех соответствующих местах.
//Если буквы в слове нет, засчитывается ошибка.
//Ограничение на ошибки:
//Игрок имеет ограниченное количество попыток (например, 6-8 ошибок).
//За каждую ошибку "рисуется текстовыми символами" часть виселицы
// или человечка (голова, тело, руки, ноги).
//Победа или поражение:
//        Игрок выигрывает, если угадывает слово до истечения попыток.
//        Проигрывает, если использует все попытки, не угадав слово.
public class Hangman {
  private static final String[] WORDS = {"apple", "banana", "kiwi", "grape", "melon"};
  private static final int MAX_ERRORS = 6;

    public static void main(String[] args) {
        String word = getRandomWord();
        char[] hiddenWord = initializeHiddenWord(word);
        char[] wrongAttempts = new char[MAX_ERRORS];
        int wrongCount = 0;
        System.out.println("Игра Виселица!!!");

        while (wrongCount < MAX_ERRORS){
            drawHangman(wrongCount);
            System.out.println("Загаданное слово: " + new String(hiddenWord));
            System.out.println("Количесво ошибок: " + wrongCount);
            System.out.println("Неверные буквы: " + Arrays.toString(getNotEmptyCharacters(wrongAttempts)));

            char letter = getUserInput(hiddenWord, wrongAttempts);

            if(word.indexOf(letter) >= 0){
                updateHiddenWord(word, letter, hiddenWord);
                System.out.println("Верно!");
            } else {
                wrongAttempts[wrongCount] = letter;
                wrongCount++;
                System.out.println("Неверно!");
            }

            if(isWordGuessed(hiddenWord)){
                System.out.println("Ура!!! Вы выиграли!!!");
                return;
            }
        }
        drawHangman(wrongCount);
        System.out.println("Вы проиграли!!!");
    }

    private static boolean isWordGuessed(char[] hiddenWord) {
        return !new String(hiddenWord).contains("_");
    }

    private static void updateHiddenWord(String word, char letter, char[] hiddenWord) {
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == letter){
                hiddenWord[i] = letter;
            }
        }
    }

    private static char getUserInput(char[] hiddenWord, char[] wrongAttempts) {
        Scanner scanner = new Scanner(System.in);
        char letter;

        while(true){
            System.out.print("Введите букву: ");
            String input = scanner.nextLine().toLowerCase();
            if(input.length() != 1){
                System.out.println("Пожалуйста, введите одну букву");
                continue;
            }
            letter = input.charAt(0);
            if(containsCharacter(hiddenWord, letter) || containsCharacter(wrongAttempts, letter)){
                System.out.println("Вы уже вводили такую букву. Попробуйте другую");
            } else {
                break;
            }
        }
        return letter;
    }

    private static boolean containsCharacter(char[] letters, char letter) {
        for (char c : letters) {
            if(c == letter){
                return true;
            }
        }
        return false;
    }

    private static char[] getNotEmptyCharacters(char[] wrongAttempts) {
        StringBuilder result = new StringBuilder();
        for (char letter : wrongAttempts) {
            if(letter !='\0'){
                result.append(letter);
            }
        }
        return result.toString().toCharArray();
    }

    private static void drawHangman(int wrongCount) {
        String[][] hangman =
                {
                        {"_", "_", "_", "_", "_", " "," ", " "},
                        {"|", " ", " ", " ", "|", " "," ", " "},
                        {"|", " ", " ", " ", " ", " "," ", " "},
                        {"|", " ", " ", " ", " ", " "," ", " "},
                        {"|", " ", " ", " ", " ", " "," ", " "},
                        {"|", " ", " ", " ", " ", " "," ", " "},
                        {"|", " ", " ", " ", " ", " "," ", " "},
                        {"_", " ", " ", " ", " ", " "," ", " "},
                };
        if(wrongCount >=1) hangman[2][4] = "O";
        if(wrongCount >=2) hangman[3][4] = "|";
        if(wrongCount >=3) hangman[3][3] = "/";
        if(wrongCount >=4) hangman[3][5] = "\\";
        if(wrongCount >=5) hangman[4][3] = "/";
        if(wrongCount >=6) hangman[4][5] = "\\";

        System.out.println("Виселица:");
        for (String[] row : hangman) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    private static char[] initializeHiddenWord(String word) {
        char[] hiddenWord = new char[word.length()];
        Arrays.fill(hiddenWord, '_');
        return hiddenWord;
    }

    private static String getRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }
}
