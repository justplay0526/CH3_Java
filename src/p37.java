import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p37 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please Enter a word");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String strU = str.toUpperCase();
        String strL = str.toLowerCase();
        System.out.println("Word to Uppercase is " + strU);
        System.out.println("Word to Lowercase is " + strL);
    }
}
