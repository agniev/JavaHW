package contest;

import java.util.Scanner;

/**
 * Created by Roman on 12.09.2017.
 */
public class Solution2005 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ind = 1;
        int min = scan.nextInt();
        int element;
        for (int i = 2; i <= n; i++){
            element = scan.nextInt();
            if (min > element){
                min = element;
                ind = i;
            }
        }
        System.out.println(ind);
    }
}
