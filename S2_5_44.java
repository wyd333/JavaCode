import java.util.Arrays;
import java.util.Scanner;

public class S2_5_44 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int[] array={0,1,2,3,4,5,6,7,8,9};
        System.out.println("����Ϊ��");
        System.out.println(Arrays.toString(array));

        System.out.println("������һ������");
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
            System.out.println("��������,�±�Ϊ" + i);
        }else{
            System.out.println("û���ҵ�");
        }
    }
}