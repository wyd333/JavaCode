import java.util.Arrays;
import java.util.Scanner;

public class S2_5_4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("数组为：");
        System.out.println(Arrays.toString(array));

        System.out.println("请输入一个数：");
        int num = reader.nextInt();
        //String strNum = String.valueOf(num);
        String strArray = array.toString();
        int ret = strArray.indexOf(num);
        if(ret != -1){
            System.out.println("找到了，下标是：" + ret);
        } else {
            System.out.println("没有找到");
        }

    }
}