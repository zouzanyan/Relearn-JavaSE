package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
    /*
    * 异常通常总共有4类
    * 1.error
    * 2.exception
    * 3.Runtimeexception
    * 4.继承Exception的其他类
    * */

    // throw抛出异常

    public static void main(String[] args) throws FileNotFoundException {
        Demo demo = new Demo();
        demo.test1();
        throw new NullPointerException(); // 抛出空指针异常
    }

    /*
    * throws 用于声明异常，表示该方法可能会抛出的异常。如果声明的异常中包括 checked 异常（受检异常），那么调用者必须捕获处理该异常或者
    * 使用 `throws` 继续向上抛出。`throws` 位于方法体前，多个异常之间使用 `,` 分割。
    * */

    public void test1() throws FileNotFoundException {
        new FileInputStream("/home");
    }

}
