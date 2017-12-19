package contest;


import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Roman on 19.12.2017.
 */
public class Solution2057 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int command = in.nextInt();
            if (command == 1) {
                Integer next = in.nextInt();
                if (map.containsKey(next)){
                    map.put(next, map.get(next)+1);
                } else {
                    map.put(next, 1);
                }
            } else if (command == 2) {
                Integer value = map.firstKey();
                if (map.get(value) > 1){
                    map.put(value, map.get(value) - 1);
                } else {
                    map.remove(value);
                }
                System.out.println(value);
            }
        }
    }
}
