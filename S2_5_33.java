import  java.util.Scanner;
public class S2_5_33 {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);

        System.out.println("������ѧ������");
        int num = reader.nextInt();
        int[] score = new int[num];
        String[] name = new String[num];

        for(int i=0;i<num;i++)
        {
            System.out.println("�������"+(i+1)+"��ѧ��������");
            name[i]= reader.next();
            System.out.println("�������"+(i+1)+"��ѧ���ĳɼ�");
            score[i]=reader.nextInt();
        }

        //ֱ��ѡ������
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
        System.out.println("��һ��Ϊ:"+name[0]+"���ڶ���Ϊ:"+name[1]);
    }
}