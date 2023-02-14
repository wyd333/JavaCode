/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-02-14
 * Time: 21:29
 */


//1、实验题目：类的继承和方法重写
//定义一个基类作为父类，再定义一个继承父类的子类，在子类中重写父类的方法，使用super关键字调用父类的方法，测试其功能。
public class S4_1 {
    public static void main(String[] args) {
        //创建一个Animal对象
        Animal animal = new Animal("动物");
        //调用父类的方法
        animal.show();
        animal.say();
        //创建一个Cat对象
        Cat cat = new Cat("小猫！");
        //调用重写的父类的方法
        cat.show();
        cat.say();
    }
}

class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public void show() {
        System.out.println("一个Animal类！");
    }
    public void say() {
        System.out.println("你好" + name);
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    public void show() {
        System.out.println("一个Cat类！");
    }
    public void say() {
        System.out.println("喵喵" + name);
    }
}