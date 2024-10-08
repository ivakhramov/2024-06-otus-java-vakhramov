package ru.ivakhramov.java.basic.homeworks.lesson19;

import java.io.*;
import java.util.Scanner;

public class WorkFiles {

    private String path;
    private String extension;

    WorkFiles(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    // 1. При старте приложения, в консоль выводится список текстовых файлов из корневого каталога проекта
    public File[] GettingListFiles(String path, String extension) {

        FilenameFilter extensionFileFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(extension);
            }
        };

        System.out.println("В корневом каталоге текущего проекта содержатся следующие тектовые файлы: ");
        File dir = new File(path);
        File[] files = dir.listFiles(extensionFileFilter);

        if (dir.isDirectory() && files != null && files.length > 0) {
            for (File item : dir.listFiles(extensionFileFilter)) {
                if (item.isFile()) {
                    System.out.println(item.getName());
                }
            }
        } else {
            System.out.println("В текущем каталоге проекта нет текстовых файлов");
            return null;
        }
        return files;
    }

    // 3. Содержимое файла выводится в консоль
    public void CustomFileReader(String fileName, String path) {

        if (fileName == null) {
            return;
        }

        System.out.println("Содержимое файла " + fileName + ":");
        try (BufferedReader in = new BufferedReader(new FileReader(path + fileName))) {
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 4. Затем любую введенную пользователем строку необходимо записывать в указанный файл

    public void NewLineWriter(String fileName, String path) {

        if (fileName == null) {
            return;
        }

        System.out.println("Введите строку, которую вы хотите записать в выбранный файл:");

        try (BufferedWriter out = new BufferedWriter(new FileWriter(path + fileName, true));
             Scanner scanner = new Scanner(System.in)) {
            String customString = scanner.nextLine();
            out.newLine();
            out.write(customString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
