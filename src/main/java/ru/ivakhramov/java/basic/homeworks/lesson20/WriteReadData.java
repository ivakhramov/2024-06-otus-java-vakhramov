package ru.ivakhramov.java.basic.homeworks.lesson20;

import java.io.*;
import java.net.Socket;

public class WriteReadData {

    public static String readRequest (Socket client) throws IOException {

        DataInputStream in = new DataInputStream(new BufferedInputStream(client.getInputStream()));
        return in.readUTF();
    }

    public static void writeResponse (Socket client, String response) throws IOException {

        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        out.writeUTF(response);
        out.flush();
    }
}
