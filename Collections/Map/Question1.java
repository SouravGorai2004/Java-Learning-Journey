// Problem: Given a string s, return the first character that does not repeat.
// If all characters repeat, return -1.

import java.util.*;

class Question1 {

    static char isRepeat(String s) {
        HashMap<Character, Integer> feq = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) {
            feq.put(ch, feq.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : feq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '-';

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter a String : ");
        str = sc.nextLine();
        char res = isRepeat(str);
        if (res == '-') {
            System.out.println(str + " : Has No Non Repeating Chracter");
        } else {
            System.out.println("In " + str + ", First Non Repeating Chracter is: " + res);

        }
    }

}
