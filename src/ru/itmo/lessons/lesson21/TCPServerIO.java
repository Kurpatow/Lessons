package ru.itmo.lessons.lesson21;

import ru.itmo.lessons.lesson19.IO;

import javax.swing.text.MaskFormatter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerIO {
    private int port;
    public TCPServerIO(int port) {
        this.port = port;
    }
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен...");
            while (true) {
                Socket socket = serverSocket.accept();
                Connection<Message> connection = new Connection<>(socket);
                Message fromClient = connection.readMessage();
                System.out.println("От клиента: " + fromClient);
                Message message = new Message("Server", "Сообщение от сервера");
                connection.sendMessage(message);
            }
        }catch (IOException | ClassNotFoundException e) {
            System.out.println("Обработка IOException | ClassNotFoundException");
        }
    }

    public static void main(String[] args) {
        new TCPClientIO("127.0.0.1", 8090).run();
    }
}
