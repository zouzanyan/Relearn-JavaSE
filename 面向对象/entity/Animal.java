package 面向对象.entity;


/*- 子类拥有父类public,protected所有属性和方法。
- 子类可以拥有自己的属性和方法。
- 子类可以重写实现父类的方法。
- Java 中的继承是单继承，一个类只有一个父类。*/
public class Animal {
    public Integer legNum;
    public void say(){
        System.out.println("我是一个动物");
    }
}
