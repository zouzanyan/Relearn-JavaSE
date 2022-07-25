package 基础语法;

import java.util.Arrays;

public class Helloworld {
    public static void main(String[] args) {
        final String b = "wawd";    // final修饰的变量不可被修改
        System.out.println(b);

        long num1 = 468486L;    // 使用long修饰的变量数值后一般加上L
        System.out.println(num1);

        double num3 = 1 / 3.0d;
        System.out.println(num3); // 0.3333333333333333

        float num4 = 1.0f / 3;
        System.out.println(num4); // 0.33333334

        char char1 = 65;    // char可以和整数互相转换
        System.out.println(char1);

        char[] msg = {73, 76, 79, 86, 69, 89, 79, 85};
        System.out.println(msg); // ILOVEYOU

        boolean boo = true;
        System.out.println(boo);

        String str1 = "hello,zou!"; // String是引用数据类型,不是八大基本数据类型,String是常量,初始化后不可修改
        String str2 = new String("hello,ZOU!");

        /*
         * 八大基本数据类型
         * 整型 : byte,int,long,short
         * 字符型 : char
         * 浮点型 : float(单精度),double(双精度)
         * 布尔型 : boolean
         * */

        System.out.println(str1.length()); // 计算字符串长度
        System.out.println(str1.equalsIgnoreCase(str2)); // 判断两个字符串对象的内容是否相等,忽略大小写,equals方法就是从第一个字符开始一个个比较

        String a = "ab";
        String bb = "b";
        String b1 = "a" + bb;
        System.out.println(a == b1); // false
        String str01 = "abc";
        String str02 = "abc";
        System.out.println(str01 == str02);//true
        /*
        JVM对于字符串引用，由于在字符串的"+"连接中，有字符串引用存在，而引用的值在程序编译期是无法确定的，即"a" + bb无法被编译器优化，只有在程
        序运行期来动态分配并将连接后的新地址赋给b1。所以上面程序的结果也就为false
        bb字符串加了final修饰，对于final修饰的变量，它在编译时被解析为常量值的一个本地拷贝存储到自己的常量池中或嵌入到它的字节码流中。所以此时的
        "a" + bb和"a" + “b”效果是一样的。故上面程序的结果为true
        */

        boolean boo1 = false;
        String str4 = boo1 + "ke";
        System.out.println(str4);
        // 而且使用 `+` 进行连接，不仅可以连接字符串，也可以连接其他类型。但是要求进行连接时至少有一个参与连接的内容是字符串类型。

        String str3 = "abcd";
        System.out.println(str3.charAt(2)); // 根据索引获取字符串的单个字符

        /*
        String 是无法被修改的，对 String 的修改，其实是新建了一个 String 对象。如果需要修改字符串的内容，可以使用 StringBuilder。它相当
        于一个存储字符的容器。
        */

        /*
         * 异或 ^ 如果两个操作数逻辑相同，则结果为假，否则为真
         * `&&` 与 `||` 是具有短路性质，当按优先级顺序计算到当前表达式时，表达式的结果可以确定整个表达式的结果时，便不会继续向后进行判断和计算，
         * 而直接返回结果。
         * */

        int num01 = 4;
        int num02 = 5;
        System.out.println(num01 == num02 ? a : num02);

        /*
         * 如果布尔表达式的值为 `true`，则返回表达式 1的值，否则返回表达式 2的值。
         * */

        // 静态方法只能调用静态方法

        /*数组是用于储存多个相同类型数据的集合
         * 使用数组前要声明数组
         * 声明数组后，需要为数组分配空间，也就是定义多大的数组
         * */
        int[] arr1 = new int[5];
        int[] arr2;
        arr1[0] = 23;
        arr2 = arr1;
        System.out.println(arr1 == arr2);

        int[][] array11 = {{1,2},{3,4}};
//        for (int i = 0; i < array11.length; i++) {
//            for (int j = 0; j < array11[0].length; j++) {
//                System.out.println(array11[i][j]);
//            }
//        }

//         scanner用法
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        System.out.println(s);
//        while(!in.hasNext("exit")){
//            System.out.println(in.nextLine());
//        }
//        in.close();

        // 对整型数组排序
        int[] array = {45,98,56,12,99,78,456,23,74,8,1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


    }
}
//wadwad