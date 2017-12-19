package contest;

import java.util.Scanner;

/**
 * Created by Roman on 18.09.2017.
 */
public class Solution2011 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 7){
            System.out.println("preschool child");
        } else if(n <= 17){
            System.out.println("schoolchild "+(n-6));
        } else if (n <= 22){
            System.out.println("student "+(n-17));
        } else if (n > 22){
            System.out.println("specialist");
        }
    }
}
