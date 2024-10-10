package ru.ivakhramov.java.basic.homeworks.lesson19;

import java.io.*;

/**
 * Реализуйте приложение, позволяющее работать с текстовыми файлами
 */
public class HomeworkLesson19Main {

    public static void main(String[] args) {

        String pathProject = System.getProperty("user.dir") + "/";
        String extension = ".txt";

        WorkFiles workDir = new WorkFiles(pathProject, extension);

        File[] files = workDir.GettingListFiles(pathProject, extension);
        String fileName = UserChoice.SelectFile(files);
        workDir.CustomFileReader(fileName, pathProject);
        workDir.NewLineWriter(fileName, pathProject);
        workDir.CustomFileReader(fileName, pathProject);
    }
}