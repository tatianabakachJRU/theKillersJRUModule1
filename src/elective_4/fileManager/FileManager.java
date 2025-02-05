package elective_4.fileManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class FileManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к каталогу: ");
        String currentDir = scanner.nextLine();

        while (true) {
            System.out.println("/nТекущая директория " + currentDir);
            System.out.println("1.Список папок и файлов в директории");
            System.out.println("2.Поиск по имени");
            System.out.println("3.Копирование");
            System.out.println("4.Сортировка");
            System.out.println("5.Выход");

            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1:
                        listDirAndFiles(currentDir);
                        break;
                    case 2:
                        System.out.print("Введите имя для поиска: ");
                        String fileName = scanner.nextLine();
                        searchByName(currentDir, fileName);
                        break;
                    case 3:
                        System.out.print("Введите откуда копируем: ");
                        String sourcePath = scanner.nextLine();
                        System.out.print("Введите куда копируем: ");
                        String destPath = scanner.nextLine();
                        copy(sourcePath, destPath);
                        break;
                    case 4:
                        System.out.println("Тип сотировки: 1 - по имени, 2 - по размеру");
                        int sortType = Integer.parseInt(scanner.nextLine());
                        sort(currentDir, sortType);
                        break;
                    case 5:
                        return;

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void listDirAndFiles(String directory) {
        System.out.println("Список файлов и папок в : " + directory);
        try {
            File dir = new File(directory);
            File[] files = dir.listFiles();

            if (files != null) {
                for (File file : files) {
                    BasicFileAttributes basicFileAttributes
                            = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                    System.out.println("Имя; " + file.getName()
                            + "Размер: " + basicFileAttributes.size()
                            + "Дата создания: " + basicFileAttributes.creationTime()
                            + "Права доступа: " + (file.canRead() ? "r" : "-")
                            + (file.canWrite() ? "w" : "-"));
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e.getMessage());
        }

    }

    private static void searchByName(String directory, String name) {
        File dir = new File(directory);
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.getName().contains(name)) {
                    System.out.println("Найден: " + file.getAbsolutePath());
                }
            }
        }
    }

    private static void copy(String sourcePath, String destPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path dest = Paths.get(destPath);

        if(Files.isDirectory(source)){
            Files.walk(source).forEach(sourceFile -> {
                Path destFile = dest.resolve(source.relativize(sourceFile));
                try{
                  Files.copy(sourceFile, destFile, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    System.out.println("Ошибка копирования: " + e.getMessage());
                }
            });
        } else {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        }
        System.out.println("Объект скопирован");
    }

    private static void sort(String directory, int sortType) throws IOException {
        File dir = new File(directory);
        File[] files = dir.listFiles();

        if (files != null) {
            List<File> fileList = Arrays.asList(files);
            switch (sortType){
                case 1:
                    Collections.sort(fileList, new Comparator<File>() {
                        @Override
                        public int compare(File o1, File o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    break;
                case 2:
                    Collections.sort(fileList, new Comparator<File>() {
                        @Override
                        public int compare(File o1, File o2) {
                            return Long.compare(o1.length(), o2.length());
                        }
                    });
                    break;
                default:
                    System.out.println("Неверный тип сортировки.");
            }
            for (File file : fileList) {
                BasicFileAttributes basicFileAttributes
                        = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                System.out.println("Имя; " + file.getName()
                        + "Размер: " + basicFileAttributes.size()
                        + "Дата создания: " + basicFileAttributes.creationTime()
                        + "Права доступа: " + (file.canRead() ? "r" : "-")
                        + (file.canWrite() ? "w" : "-"));
            }
        } else {
            System.out.println("Директория не может быть прочитана");
        }
    }
}
