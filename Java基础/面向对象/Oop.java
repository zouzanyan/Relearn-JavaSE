package 面向对象;


/*
 * 局部变量:在方法、构造方法或者语句块中定义的变量被称为局部变量。变量声明和初始化都是在方法中，方法结束后，变量就会自动销毁。
 * 成员变量:成员变量是定义在类中，方法体之外的变量。这种变量在创建对象的时候实例化。成员变量可以被类中方法、构造方法和特定类的语句块访问。
 * 类变量:也叫静态变量，类变量也声明在类中，方法体之外，但必须声明为 `static` 类型。
 * */

/*
 * 定义类的时候不会为类开辟内存空间，但是一旦创建了对象，系统就会在内存中为对象开辟一块空间，用来存放对象的属性值和方法
 * */

/*
*  局部变量的作用域仅限于定义它的方法内。而成员变量的作用域在整个类内部都是可见的。
   同时在相同的方法中，不能有同名的局部变量；在不同的方法中，可以有同名的局部变量。
   成员变量和局部变量同名时，局部变量具有更高的优先级。
* */

import 面向对象.entity.User;

/*
* 如果在定义类的时候没有写构造方法，系统会默认生成一个无参构造方法，这个构造方法什么也不会做。
* 当有指定的构造方法时，系统都不会再添加无参构造方法了。
* 构造方法的重载：方法名相同，但参数不同的多个方法，调用时会自动根据不同的参数选择相应的方法。
*
* */
public class Oop {
    public static void main(String[] args) {
        User user1 = new User(23);
        user1.username = "root";
        user1.password = "rrrr";
        System.out.println(user1.getInfo());
    }
}
