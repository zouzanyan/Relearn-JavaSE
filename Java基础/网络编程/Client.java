package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String hostname = "127.0.0.1";
        int port = 8887;
        Scanner userIn = new Scanner(System.in);
        try {
            Socket socket = new Socket(hostname, port);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); // 获取客户端输出流,比如发送的数据
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 获取输入流,比如服务器发送的数据
            String userInput;
            System.out.println("请输入信息:");
            while (!"exit".equals(userInput = userIn.nextLine())) {
                out.println(userInput);
                System.out.println("服务器回应:" + in.readLine());

            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
