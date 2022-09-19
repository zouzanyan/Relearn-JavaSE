package 异常;

// 自定义异常
public class MyExcepiton extends NullPointerException{ // 这里我顺便写的一个异常名称
    // 无参构造器
    public MyExcepiton(){
    }

    public MyExcepiton(String msg){
        super(msg);
    }

}
