package 面向对象;

import 面向对象.entity.Animal;
import 面向对象.entity.AnimalInterface;

public class AnimalImpl implements AnimalInterface {
    @Override
    public void eat() {
        System.out.println("我能吃");
    }

    @Override
    public void sleep() {
        System.out.println("我能睡");
    }

    public void play() {
        System.out.println("我能玩");
    }

    public static void main(String[] args) {
        AnimalInterface animal = new AnimalImpl();
        animal.eat();
        animal.sleep();
        //animal.play(); // 用接口类型声明时不可调用子类的特有方法
    }
}
