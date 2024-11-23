package ru.ivakhramov.java.basic.homeworks.lesson27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class HomeworkLesson27Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя файла: ");
        String fileName = scanner.nextLine();
        System.out.println("Введите искомую последовательность символов: ");
        String searchSimbols = scanner.nextLine();

        if (fileName.isEmpty() || searchSimbols.isEmpty()) {
            System.out.println("Имя файла и искомая последовательность символов не должны быть пустыми");
            return;
        }

        if (!fileExists(fileName)) {
            System.out.println("Файл не найден: " + fileName);
            return;
        }

        System.out.println("Искомая последовательность символов встречается в файле " + fileName + " " + counterSearchSimbols(fileName, searchSimbols) + " раз");
    }

    public static boolean fileExists(String fileName) {

        return Files.exists(Paths.get(fileName));
    }

    public static int counterSearchSimbols(String fileName, String searchSimbols) {

        int counter = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int index = 0;
                while ((index = line.indexOf(searchSimbols, index)) != -1) {
                    counter++;
                    index += searchSimbols.length();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return counter;
    }
}
