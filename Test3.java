/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-19
 * Time: 10:58
 */
//分数的分子和分母用两个整型数表示
//类所拥有的方法包括对分数进行加、减、乘、除等运算，以及输出分数的方法，输出分数的格式应该是：分子/分母。
//在测试类中定义分数类对象，运算并输出运算结果。
public class Test3 {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(4,5);
        Fraction fraction2 = new Fraction(3,4);
        System.out.println("分数1：" + fraction1 + " 分数2：" + fraction2);
        System.out.println("add:" + fraction1.add(fraction2));
        System.out.println("sub:" + fraction1.sub(fraction2));
        System.out.println("mul:" + fraction1.mul(fraction2));
        System.out.println("div:" + fraction1.div(fraction2));
    }
}

class Fraction {
    private int mol;    //分子
    private int den;    //分母
    private int getComDivisor(int a , int b){
        if(a % b == 0) {
            return b;
        }

        return getComDivisor(b,a % b);
    }

    public Fraction(int x, int y) {
        if (y == 0){
            throw new ArithmeticException("分母为0！");
        }
        this.mol = x;
        this.den = y;
        int tmp = getComDivisor(x,y);
        this.mol = x/tmp;
        this.den = y/tmp;
    }

    public Fraction add(Fraction x){
        return new Fraction(this.mol * x.den + x.mol * this.den,this.den * x.den);
    }
    public Fraction sub(Fraction x){
        return new Fraction(this.mol * x.den - x.mol * this.den,this.den * x.den);
    }
    public Fraction mul(Fraction x){
        return new Fraction(this.mol * x.mol,this.den * x.den);
    }
    public Fraction div(Fraction x){
        if(x.mol == 0) {
            throw new ArithmeticException("除数为0！");
        }
        return new Fraction(this.mol * x.den,this.den * x.mol);
    }

    @Override
    public String toString() {
        return mol+"/"+den;
    }
}

