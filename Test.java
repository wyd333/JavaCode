import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-13
 * Time: 12:56
 */
public class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double s = reader.nextDouble();
        System.out.println(getArea(s));
    }
    public static double getArea(double s){
        double x1 = 6*Math.pow(s,2);
        double x2 = 4*Math.tan(Math.PI/6);
        return x1/x2;
    }
}
