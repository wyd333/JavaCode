import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) { 
            String str = in.nextLine();
            boolean[] flg = new boolean[129];
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(flg[ch] == false) {
                    sb.append(ch);
                    flg[ch] = true;
                }
            }
            System.out.println(sb);

        }

    }
}