/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-18
 * Time: 18:25
 */

//2、猴子吃桃问题。
// 猴子第一天摘下若干个桃子，当时就吃了一半，又吃了一个。
// 第二天又将剩下的桃子吃掉一半，又多吃了一个。
// 以后每天都吃前一天剩下的一半零一个。
// 到第 10 天在想吃的时候就剩一个桃子了,
//求第一天共摘下来多少个桃子？
    
public class PracticeThree {
    public static void main(String[] args) {
        int num = 1;
        int i = 10;
        while(i != 0) {
            System.out.println("第"+i+"天有"+num+"个桃子");
            num = (num + 1) * 2;
            i--;
        }
    }
}
