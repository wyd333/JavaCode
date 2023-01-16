import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-16
 * Time: 12:05
 */

//编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换
public class PracticeOne {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.next();
        System.out.println(str.toUpperCase());
    }
    public static void main1(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入一个字符：");

        while(reader.hasNext()) {
            String str = reader.nextLine();
            char ch = str.charAt(0);
            if(Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    System.out.println(Character.toUpperCase(ch));
                } else if (!Character.isLowerCase(ch)) {
                    System.out.println(ch);
                }
            } else {
                System.out.println("不是一个字母字符！无法操作！");
            }
        }
    }
}
