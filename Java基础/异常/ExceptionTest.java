package 异常;

import java.util.Arrays;

public class ExceptionTest {
    public static void main(String[] args) {
        int[] array = new int[5];
        Arrays.fill(array,5);

        for (int i = 4; i > -1; i--) {
            if (i == 0){
                throw new MyExcepiton("this is an exception");
            }
            System.out.println(array[i]/i);
        }
    }
}
