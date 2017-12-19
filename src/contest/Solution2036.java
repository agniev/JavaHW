package contest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.valueOf;

/**
 * Created by Roman on 18.09.2017.
 */
public class Solution2036 {
    public static void main(String[] args) throws Exception {
        String line;
        Matcher m;

        Scanner scan = new Scanner(System.in);
        int n = valueOf(scan.nextLine());

        Pattern pattern = Pattern.compile("([a-z]*)([e|y|u|i|o|a]{3,})([a-z]*)");

        for (int i = 0; i < n; i++){
            line = scan.nextLine();
            m = pattern.matcher(line);
            if (m.matches()) {
                continue;
            }
            System.out.println(line);
        }
    }
}
