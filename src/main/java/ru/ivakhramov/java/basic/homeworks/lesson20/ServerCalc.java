package ru.ivakhramov.java.basic.homeworks.lesson20;

import java.net.ServerSocket;
import java.net.Socket;

import static ru.ivakhramov.java.basic.homeworks.lesson20.Calculator.calculate;
import static ru.ivakhramov.java.basic.homeworks.lesson20.WriteReadData.readRequest;
import static ru.ivakhramov.java.basic.homeworks.lesson20.WriteReadData.writeResponse;

public class ServerCalc {

    public static void main(String[] args) {

        int port = 8187;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер работает на порте: " + port);
            while (true) {
                Socket clientAccept = serverSocket.accept();
                writeResponse(clientAccept,"Вы можете выполнить следующие математические вычисления: +,-,*,/\n" +
                        "Введите число a");
                double a = Double.parseDouble(readRequest(clientAccept));
                writeResponse(clientAccept, "Вы ввели число: a = " + a + "\n" +
                        "Введите число b");
                double b = Double.parseDouble(readRequest(clientAccept));
                writeResponse(clientAccept, "Вы ввели число: b = " + b + "\n" +
                        "Введите одну из арифметических операций: +, -, *, или /");
                String arithmetic = readRequest(clientAccept);
                writeResponse(clientAccept, "Вы выбрали операцию: " + arithmetic);
                double calcResult = calculate(a, b, arithmetic);
                writeResponse(clientAccept, "Значение вычисления " + a + " " + arithmetic + " " + b + " = " + calcResult);
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
