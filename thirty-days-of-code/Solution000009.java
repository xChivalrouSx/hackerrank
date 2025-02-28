import java.util.*;

public class Solution000009 {

    // Day 8: Dictionaries and Maps
    // https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?isFullScreen=true

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s)) {
                System.out.println(String.format("%s=%s", s, phoneBook.get(s)));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}