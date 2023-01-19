import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-19
 * Time: 13:57
 */
//2、给定一个3乘以3的二维数组，里面的数据随机生成。分别求出两个对角线的元素之和。
public class Test4 {
    public static void main(String[] args) {
        final int n = 3;
        int[][] array = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101);
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("二维数组为：");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                if (i == j) {
                    sum1 += array[i][j];
                }
                if(i + j == n-1) {
                    sum2 += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("主对角线之和为：" + sum1);
        System.out.println("副对角线之和为：" + sum2);
    }
}
