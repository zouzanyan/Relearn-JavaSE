package 面向对象;

import 面向对象.entity.Telephone;

public class Cellphone extends Telephone {

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void message() {
        System.out.println("发短信");
    }

    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.call();
        cellphone.message();
    }
}
