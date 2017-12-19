package contest;

import java.util.*;

public class Solution2056 {
//    static String inputFile = "C:\\Users\\Roman\\Desktop\\SberTech\\Contest\\src\\input.txt";
    //        try(Scanner scan = new Scanner(new FileInputStream(inputFile))){
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("[^A-Za-z]+");
        Map<String, Integer> map = new HashMap();
        while (scan.hasNext()) {
            String slice = scan.next().toLowerCase();
            if (map.get(slice) == null) {
                map.put(slice, 1);
            } else {
                map.put(slice, map.get(slice) + 1);
            }
        }
        int max = Collections.max(map.values());
        SortedSet<String> popularStrings = new TreeSet<>();
        for (String key : map.keySet()) {
            if (map.get(key) == max) {
                popularStrings.add(key);
            }
        }
        for (String mostPopular : popularStrings) {
            System.out.println(mostPopular);
        }
    }
}
