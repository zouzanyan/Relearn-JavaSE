package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            Socket client = serverSocket.accept();

            System.out.println(client.getInetAddress().getHostName() + "已连接");
            PrintWriter printWriter = new PrintWriter(client.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String userIn;
            while ((userIn = in.readLine()) != null) {
                System.out.println("收到客户端消息:" + userIn);
                printWriter.println(userIn);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
