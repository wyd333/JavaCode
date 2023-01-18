import java.util.Scanner;

public class S3_2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("请输入要运算的数据类型（0为int，1为double）：");
        int judge = reader.nextInt();

        if(judge == 0){
            System.out.println("请输入两个整数：");
            int x = reader.nextInt();
            int y = reader.nextInt();
            System.out.println("请输入运算符（+ - * /）");
            String operation = reader.next();

            int ret = 0;
            switch(operation){
                case "+":
                    ret = calculator.add(x,y);
                    break;
                case "-":
                    ret = calculator.sub(x,y);
                    break;
                case "*":
                    ret = calculator.mul(x,y);
                    break;
                case "/":
                    ret = calculator.div(x,y);
                    break;
            }
            System.out.println("计算结果是" + ret);

        }else if(judge == 1){
            System.out.println("请输入两个实数：");
            double x = reader.nextDouble();
            double y = reader.nextDouble();
            System.out.println("请输入运算符（+ - * /）");
            String operation = reader.next();

            double ret = 0;
            switch(operation){
                case "+":
                    ret = calculator.add(x,y);
                    break;
                case "-":
                    ret = calculator.sub(x,y);
                    break;
                case "*":
                    ret = calculator.mul(x,y);
                    break;
                case "/":
                    ret = calculator.div(x,y);
                    break;
            }
            System.out.printf("计算结果是%.2f",ret);    //保留2位小数
        }
    }
}

class Calculator {
    public int add(int x,int y) {
        return x+y;
    }
    public int sub(int x,int y){
        return x-y;
    }
    public int mul(int x,int y) {
        return x*y;
    }
    public int div(int x,int y){
        return x/y;
    }
    public double add(double x,double y) {
        return x+y;
    }
    public double sub(double x,double y){
        return x-y;
    }
    public double mul(double x,double y) {
        return x*y;
    }
    public double div(double x,double y){
        return x/y;
    }

}
