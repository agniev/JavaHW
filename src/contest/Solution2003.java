package contest;

import java.util.Scanner;

/**
 * Created by Roman on 12.09.2017.
 */
public class Solution2003 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        int sign = 1;
        for (int i = 0; i < n; i++){
            sum += sign * scan.nextInt();
            sign *= -1;
        }
        System.out.println(sum);
    }
}
