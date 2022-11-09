
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p38 {
    public static void main(String[] args)throws IOException {
        System.out.println("Please Enter a String");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        System.out.println("Please Enter a alphabet");

        String str2 = br.readLine();
        char ch = str2.charAt(0);

        int num = str1.indexOf(ch);

        if(num != -1)
            System.out.println("The Location you want to find [" + ch + "] is " + (num+1));
        else
            System.out.println("Not found");
    }
}
