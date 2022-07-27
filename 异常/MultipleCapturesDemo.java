package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


/*
* 在一段代码中，可能会由于各种原因抛出多种不同的异常，而对于不同的异常，我们希望用不同的方式来处理它们，而不是笼统的使用同一个方式处理，在这种情况
* 下，可以使用异常匹配，当匹配到对应的异常后，后面的异常将不再进行匹配。
* */
public class MultipleCapturesDemo {
    public static void main(String[] args) {
        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // 首先打印的是距离抛出异常最近的语句，接着是调用该方法的方法，一直到最开始被调用的方法。
        } catch (Exception e){
            System.out.println("发生异常");
        }
    }
}
