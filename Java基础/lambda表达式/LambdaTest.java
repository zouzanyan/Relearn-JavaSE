package lambda表达式;


// Lambda 表达式是 Java SE 8 中一个重要的新特性。Lambda 表达式允许你通过表达式来代替功能接口。

/*
 * 一个 Lambda 表达式具有下面这样的语法特征。它由三个部分组成：第一部分为一个括号内用逗号分隔的参数列表，参数即函数式接口里面方法的参数；第二部分
 * 为一个箭头符号：`->`；第三部分为方法体，可以是表达式和代码块。
 * */


import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class LambdaTest {
    public static void main(String[] args) {
        // 通常创建线程,需要重写Runnable方法,较为繁琐
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

        // 使用lambda方法来创建线程
        //使用Labmda表达式需要函数式编程接口，比如在Runnable接口上我们可以看到@FunctionalInterface注解（标记着这个接口只有一个抽象方法）
        new Thread(() -> {
            System.out.println("helloworld");
        }).start();

        //使用Lambda表达式，实际就是创建出该接口的实例对象。

        // Stream 是 Java 8 开始的一个新的抽象层。通过使用 Stream，你能以类似于 SQL 语句的声明式方式处理数据。
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println); // 输出10个随机数

        Stream<Integer> stream1 = Stream.of(1,2,3,4);
        stream1.forEach(System.out::println);



    }
}
