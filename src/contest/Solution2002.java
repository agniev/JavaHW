package contest;

import java.util.Scanner;

public class Solution2002 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++){
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}
