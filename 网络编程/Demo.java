package 网络编程;

import java.io.IOException;
import java.net.InetAddress;

public class Demo {
    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://www.lanqiao.cn");
//        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//        urlConnection.setRequestMethod("GET");
//        urlConnection.setConnectTimeout(1000);
//        InputStream inputStream = urlConnection.getInputStream();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        bufferedReader.lines().forEach(System.out::println);
//        inputStream.close();
//        bufferedReader.close();
//        urlConnection.disconnect();

        InetAddress shiyanlou = InetAddress.getByName("www.baidu.com");
        System.out.println(shiyanlou.toString());
        String ip = shiyanlou.toString().split("/")[1];
        System.out.println(ip);
        InetAddress address = InetAddress.getByName(ip);
        System.out.println(address.getHostName());
    }
}
