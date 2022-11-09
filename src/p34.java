import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p34 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please Enter a integer");
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println("Your number is " + num);
    }
}
