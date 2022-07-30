package 网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class multiThreadServer {
    public static void main(String[] args) {
        int port = 8887;
        try {
            ServerSocket serverSocket = new ServerSocket(port);

            while (true) {
                Socket client = serverSocket.accept();
                Thread servThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {

                            System.out.println(client.getInetAddress() + ":" + String.valueOf(client.getPort()) + "已连接上");
                            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
                            String userIn;
                            while ((userIn = in.readLine()) != null) {
                                out.println(userIn);
                                System.out.println("收到" + client.getInetAddress() + "信息:" + userIn);
                            }
                            client.close();
                            System.out.println(client.getInetAddress() + "已关闭连接");

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                });
                servThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
