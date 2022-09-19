package 面向对象;



/*
将一个类的定义放在另一个类的定义内部，这就是内部类。而包含内部类的类被称为外部类。
1. 内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类
2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据
3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便
4. 内部类允许继承多个非接口类型
*/

public class People {
    private String name = "zou";

    public class Student{
        String id = "4654";
        public void getName(){
            System.out.println(name); // 访问外部类中的name
        }
    }

    public static void main(String[] args) {
        People people = new People();
        Student student = people.new Student(); // 使用外部类对象创建内部类对象
        student.getName();
    }
}
