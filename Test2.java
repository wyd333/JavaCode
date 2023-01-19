import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-19
 * Time: 12:28
 */
public class Test2 {
    public static int getComDivisor(int a , int b){
        if(a % b == 0) {
            return b;
        }
        return getComDivisor(b,a%b);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //输入两个数
        int n = reader.nextInt();
        int m = reader.nextInt();

        System.out.println(getComDivisor(n,m));
    }
    public static void main1(String[] args) {
        //辗转相除法求最大公约数、最小公倍数
        Scanner reader = new Scanner(System.in);

        //输入两个数
        int n = reader.nextInt();
        int m = reader.nextInt();

/*因为求最大公约数和最小公倍数都需要用到m、n，且辗转相除的过程会改变n、m的值，
故再创建两个变量n2、m2，把m和n的值拷贝一份再做运算*/
        int m2 = m;
        int n2 = n;

        int r = n2 % m2;
        //最大公约数
        while (r != 0) {
            n2 = m2;
            m2 = r;    //注意：m2才是所求的最大公约数的结果，而不是r
            r = n2 % m2;
        }
        System.out.println(m2);
    }
}
