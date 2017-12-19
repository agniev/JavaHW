package contest;

import java.util.Scanner;

/**
 * Created by Roman on 17.09.2017.
 */
public class Solution2007 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int countZeros = 0;
        while (n % 2 == 0){
            n = n / 2;
            countZeros++;
        }
        System.out.println(countZeros);
    }
}
