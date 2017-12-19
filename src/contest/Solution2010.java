package contest;

import java.util.Scanner;

/**
 * Created by Roman on 18.09.2017.
 */
public class Solution2010 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;
        while (a > 0 && b > 0){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
            count++;
        }
        if (a > b){
            System.out.println(count+" "+a);
        } else {
            System.out.println(count+" "+b);
        }
    }
}
