package contest;

import java.util.Scanner;

/**
 * Created by Roman on 17.09.2017.
 */
public class Solution2008 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int countN = 0;
        int countM = 0;
        for (int i=0; i<n; i++){
            int thisThing = scan.nextInt();
            if (countM + thisThing <= w){
                countN++;
                countM += thisThing;
            }
        }
        System.out.println(countN+" "+countM);
    }
}
