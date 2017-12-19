package contest;

import java.util.Scanner;

/**
 * Created by Roman on 12.09.2017.
 */
public class Solution2004 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer;
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0){
            answer = 1;
        }else {
            answer = 0;
        }
        System.out.println(answer);
    }
}
