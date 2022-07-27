package lambda表达式;


// Lambda 表达式是 Java SE 8 中一个重要的新特性。Lambda 表达式允许你通过表达式来代替功能接口。

/*
* 一个 Lambda 表达式具有下面这样的语法特征。它由三个部分组成：第一部分为一个括号内用逗号分隔的参数列表，参数即函数式接口里面方法的参数；第二部分
* 为一个箭头符号：`->`；第三部分为方法体，可以是表达式和代码块。语法如下：
* */
public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();
        MathOperation addition = (int a,int b) -> a + b;

    }
    interface MathOperation{
        int operation(int a,int b);
    }
}
