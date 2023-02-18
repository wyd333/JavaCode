/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-02-18
 * Time: 10:06
 */
public class Test {
    public static void main(String[] args) {
/*        System.out.println(-7/2);
        System.out.println(7/2);*/
        //判断素数
        for(int num = 2; num <= 50; num++) {
            boolean flag = true;
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(num + " ");
            }
        }
    }
}
