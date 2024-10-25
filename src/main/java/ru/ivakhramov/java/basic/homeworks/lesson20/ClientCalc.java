package ru.ivakhramov.java.basic.homeworks.lesson20;

import java.net.Socket;
import java.util.Scanner;

import static ru.ivakhramov.java.basic.homeworks.lesson20.WriteReadData.readRequest;
import static ru.ivakhramov.java.basic.homeworks.lesson20.WriteReadData.writeResponse;

public class ClientCalc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int port = 8187;
        String host = "localhost";
        try(Socket socket = new Socket(host, port)) {
            System.out.println("Сервер подключается к порту: " + port);
            System.out.println(readRequest(socket));
            inputNumber(socket, scanner);
            System.out.println(readRequest(socket));
            inputNumber(socket, scanner);
            System.out.println(readRequest(socket));
            inputArithmetic(socket, scanner);
            System.out.println(readRequest(socket));
            System.out.println(readRequest(socket));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void inputNumber(Socket socket, Scanner scanner) {

        while(true) {
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                writeResponse(socket, input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число, попробуйте ещё раз");
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void inputArithmetic(Socket socket, Scanner scanner) {

        while(true) {
            String input = scanner.nextLine();
            try {
                if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
                    writeResponse(socket, input);
                    break;
                } else {
                    System.out.println("Вы ввели не арифметическую операцию из предложенных, попробуйте ещё раз");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
