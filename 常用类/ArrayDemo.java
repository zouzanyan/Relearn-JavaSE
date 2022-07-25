package 常用类;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        /*
        * StringBuilder 类是可变的。它是 String 的对等类，它可以增加和编写字符的可变序列，并且能够将字符插入到字符串中间或附加到字符串末尾（
        * 当然是不用创建其他对象的）。
        * */


    }
}
