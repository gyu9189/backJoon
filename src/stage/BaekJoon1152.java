package stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1152 {
    public static void main(String[] args) throws IOException {  
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        StringTokenizer stringTokenizer = new StringTokenizer(s, " ");

        System.out.println(stringTokenizer.countTokens());

    }
}
