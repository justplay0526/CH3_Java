import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p40 {
    public static  void main(String[] args)throws IOException {
        System.out.println("Please Enter a String");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        System.out.println("Please Enter a String you want conbine");

        String str2 = br.readLine();

        StringBuffer sb = new StringBuffer(str1);
        sb.append(str2);
        System.out.println(str1 + " + " + str2 + " = " + sb);
    }
}
