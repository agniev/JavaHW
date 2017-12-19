package contest;

import java.util.Scanner;

/**
 * Created by Roman on 17.09.2017.
 */
public class Solution2009 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int powers = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int thisElement = scan.nextInt();
            if (i == powers){
                powers *= 2;
                sum += thisElement;
            }
        }
        System.out.println(sum);
    }
}
