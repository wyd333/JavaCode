/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 12569
 * Date: 2023-01-29
 * Time: 17:14
 */

//5、设计一个雇员类
//（1）属性包括：编号、姓名、年龄、职务、部门，要求合理选定属性类型；
// 该雇员类还拥有统计出勤人数的功能，可以考虑为雇员类设计一个静态属性
// ；方法包括：构造方法、
// 输出信息的方法、
// 签到方法；
//
//（2）创建雇员类对象，统计雇员的出勤人数。注意考虑属性和方法的访问权限，方法的功能，及main方法中如何实现要求统计的信息。
public class S3_5 {
    public static void main(String[] args) {
        //实例化雇员对象
        Employee employee1 = new Employee(1001,"虹猫",20,"产品经理","开发部");
        Employee employee2 = new Employee(1002,"蓝兔",19,"食堂队长","后勤部");
        Employee employee3 = new Employee(1003,"大奔",21,"前台","后勤部");
        Employee employee4 = new Employee(1004,"莎莉",18,"销售总监","销售部");
        
        //签到
        Employee[] employees = {employee1,employee2,employee3,employee4};
        for (Employee x : employees) {
            System.out.println(x.toString());
            Employee.signIn(x);
        }

        //公布出勤人数
        System.out.println("共" + Employee.attendance + "人出勤！");
        
    }
}

class Employee{
    public static int attendance;  //出勤人数
    private int ID;
    private String name;
    private int age;
    private String post;
    private String department;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int ID, String name, int age, String post, String department) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.post = post;
        this.department = department;
    }

    @Override
    public String toString() {
        return  "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
    public static void signIn(Employee x) {
        System.out.println(x.name + "签到成功！");
        Employee.attendance++;
    }
}
