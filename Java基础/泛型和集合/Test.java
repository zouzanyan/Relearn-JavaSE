package 泛型和集合;

/*
* 泛型即参数化类型，也就是说数据类型变成了一个可变的参数，在不使用泛型的情况下，参数的数据类型都是写死了的，使用泛型之后，可以根据程序的需要进行改变。
* */


public class Test<T>{ // 用T代表类型
    private T op;
    /*
    * 定义泛型成员变量，定义完类型参数后，可以在定义位置之后的方法的任意地方使用类型参数，就像使用普通的类型一样。
    注意，父类定义的类型参数不能被子类继承。
    * */

    // 构造函数
    public Test(T op){
        this.op = op;
    }

    public Test(){

    }

    // getter方法
    public T getOp(){
        return this.op;
    }

    // setter 方法
    public void setOp(T op){
        this.op = op;
    }

    public void showType(){
        System.out.println(op.getClass().getName()); // 获取实际类型
    }

}

class Testdemo{
    public static void main(String[] args) {
        Test<Integer> test = new Test<>(12);
        test.showType();

        Test<String> test1 = new Test<String>("abc");
        test1.showType();


    }
}
