import  java.util.Scanner;
public class S2_5_33 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.println("请输入学生个数");
        int num = reader.nextInt();
        int[] score = new int[num];
        String[] name = new String[num];

        for(int i=0;i<num;i++)
        {
            System.out.println("请输入第"+(i+1)+"个学生的名字");
            name[i]= reader.next();
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            score[i]=reader.nextInt();
        }

        //直接选择排序
        for(int i=0;i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(score[i]<score[j])
                {
                    String tmp = name[i];
                    name[i] = name[j];
                    name[j] = tmp;
                }
            }
        }
        System.out.println("第一名为:"+name[0]+"。第二名为:"+name[1]);
    }
}