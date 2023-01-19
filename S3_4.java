public class S3_4 {
    public static void main(String[] args)

    {
        fraction a = new fraction(4, 14);
        fraction b = new fraction(1, 14);

        a.print();
        b.print();
        a.add(b).print();
        a.except(b).print();
        a.multiply(b).print();
        a.reduce(b).print();
    }
}
class fraction{
    private int a,b;
    private int gcd(int a , int b){
        if(a % b == 0)
            return b;
        return gcd(b,a%b);
    }
    fraction(int a,int b) {
        this.a = a;
        this.b = b;

        int g = gcd(b,a);
        this.a=a/g;
        this.b=b/g;
    }
    void print(){
        System.out.println(this.a+"/"+this.b);
    }
    fraction multiply(fraction r){
        return new fraction(this.a * r.a,this.b * r.b);
    }
    fraction except(fraction r){
        return new fraction(this.a * r.b,this.b * r.a);
    }
    fraction add(fraction r){
        return new fraction((this.a * r.b)+(this.b*r.a),this.b * r.b);
    }
    fraction reduce(fraction r){
        return new fraction((this.a * r.b)-(this.b*r.a),this.b * r.b);
    }
}