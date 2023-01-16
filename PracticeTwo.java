import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-16
 * Time: 12:20
 */

//编写程序，对输入的年、月、日，给出该天是该年的第多少天？
//例如：2022年1月15日，是该年的第15天
public class PracticeTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year = reader.nextInt();
        int month = reader.nextInt();
        int day = reader.nextInt();
        isDays(year,month,day);
    }
    public static void isDays(int year,int month,int day) {
        int sumDays = 0;
        switch(month) {
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9 :
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                if(year % 4 == 0 && year % 100 != 0 && year % 400 == 0) {
                    sumDays += 29;
                }else{
                    sumDays += 28;
                }
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;
            default:
                System.out.println("月份输入有误！");
                break;
        }
        System.out.println(year + "年" + month + "月" + day + "日，" +
                "是该年的第" + sumDays + "天");
    }
}
