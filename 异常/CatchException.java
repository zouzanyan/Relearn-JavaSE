package 异常;

public class CatchException {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            Class<?> class1 = Class.forName("");
            System.out.println("运行完成");
        }catch (ClassNotFoundException e){
            System.out.println("catch");
            e.printStackTrace(); //在命令行打印异常信息在程序中出错的位置及原因
        }finally {
            System.out.println("finally block");
        }
    }
}
