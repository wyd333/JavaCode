import java.util.Arrays;
import java.util.Scanner;

public class S2_5_44 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] array={0,1,2,3,4,5,6,7,8,9};
        System.out.println("数组为：");
        System.out.println(Arrays.toString(array));

        System.out.println("请输入一个数：");
        int num = reader.nextInt();

        int i = 0;
        for(; i < array.length; i++)
        {
            if(num == array[i])
            {
                break;
            }
        }
        if(i < array.length){
            System.out.println("该数存在,下标为" + i);
        }else{
            System.out.println("没有找到");
        }
    }
}