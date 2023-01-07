import java.util.Scanner;

public class S2_4_3 {
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      double price = 0.0;

      System.out.println("请输入里程数：");

      double mile = reader.nextDouble();

      if(mile <= 2 && mile > 0){
          price = 5;
      } else if (mile > 2 && mile <= 9) {
          price = (mile-2) * 1.3 + 5;
      } else if (mile > 9) {
          price = 5 + 7 * 1.3 + (mile-9) * 2 + 1;
      }

      System.out.println("价格为：" + price + "元。");
    }
}