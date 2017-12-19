package contest;

import java.util.Scanner;

import static java.lang.Math.round;

/**
 * Created by Roman on 17.09.2017.
 */
public class Solution2006 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int sm = scan.nextInt();
        int d = round((float) sm / 3);
        int f = d / 12;
        d = d % 12;
        System.out.println(f+" "+d);
    }
}
