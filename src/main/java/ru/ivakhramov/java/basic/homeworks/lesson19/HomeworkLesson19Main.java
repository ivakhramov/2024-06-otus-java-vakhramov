package ru.ivakhramov.java.basic.homeworks.lesson19;

import java.io.*;

// Реализуйте приложение, позволяющее работать с текстовыми файлами
public class HomeworkLesson19Main {

    public static void main(String[] args) {

        String path = "/home/ivakhramov/IdeaProjects/otus_java_basic_homeworks/";
        String extension = ".txt";

        WorkFiles workDir = new WorkFiles(path, extension);

        File[] files = workDir.GettingListFiles(path, extension);
        String fileName = UserChoice.SelectFile(files);
        workDir.CustomFileReader(fileName, path);
        workDir.NewLineWriter(fileName, path);
        workDir.CustomFileReader(fileName, path);
    }
}