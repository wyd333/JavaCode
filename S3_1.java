import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-16
 * Time: 11:40
 */
public class S3_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Student s1 = new Student(1001,"小明","男",18);
        Student s2 = new Student(2002,"小红","女",20);

        System.out.println("学生1：");
        s1.showNo();
        s1.showName();
        s1.showGender();
        s1.showAge();

        System.out.println("学生2：");
        s2.showNo();
        s2.showName();
        s2.showGender();
        s2.showAge();
        System.out.println("修改学生2的年龄为：");
        int age = reader.nextInt();
        s2.modifyAge(age);
        s2.showAge();
    }
}

class Student {
    private int studentNo;
    private String studentName;
    private String studentGender;
    private int studentAge;

    public Student(int studentNo, String studentName, String studentGender, int studentAge) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
    }

    public void showNo() {
        System.out.println("学号是：" + this.studentNo);
    }

    public void showName() {
        System.out.println("姓名是：" + this.studentName);
    }

    public void showGender() {
        System.out.println("性别是：" + this.studentGender);
    }
    public void showAge() {
        System.out.println("年龄是：" + this.studentAge);
    }
    public void modifyAge(int age) {
        this.studentAge = age;
    }
}
