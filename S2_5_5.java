import java.util.Arrays;
import java.util.Scanner;
public class S2_5_5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("���������������n������m��");
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] src = new int[n][m];
        int[][] dst = new int[m][n];

        System.out.printf("������һ��%d*%d�����飺\n",n,m);
        for(int i = 0; i < src.length;i++)
        {
            for(int j = 0; j < src[i].length; j++)
            {
                src[i][j] = reader.nextInt();
            }
        }

        for(int i = 0; i < dst.length; i++)
        {
            for(int j = 0; j < dst[i].length; j++)
            {
                dst[i][j] = src[j][i];
            }
        }

        System.out.println("ת�ƺ�Ķ�λ����Ϊ��");
        //System.out.println(Arrays.deepToString(dst));
        for(int i = 0; i < dst.length; i++)
        {
            for(int j = 0; j < dst[i].length; j++)
            {
                System.out.print(dst[i][j] + " ");
            }
            System.out.println();
        }
    }
}