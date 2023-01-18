/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-18
 * Time: 20:03
 */

//3、设计一个日期类
//定义类的构造方法对日期进行初始化，
// 在toString()中将其输出格式定为“月/日/年”。
// 最后，编写一个测试程序来测试所定义的日期类能否实现预定的功能.
public class Test2 {
    public static void main(String[] args) {
        MyDate date = new MyDate(2023,1,18);
        System.out.println(date);
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return month+"/"+day+"/"+year;
    }
}
