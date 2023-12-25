package lesson7.prob7_2;

public class Test {
    public String sort(String s) {
        String t = ""; // Declare t as a local variable

        if (s == null || s.length() < 1) {
            return t;
        } else {
            int nextMinPos = minpos(s);
            t = t + String.valueOf(s.charAt(nextMinPos));
            
            if (s.length() == 1 && nextMinPos == 0) {
                s = "";
            } else {
                s = s.substring(0, nextMinPos) + s.substring(nextMinPos + 1);
            }

            return t + sort(s);
        }
    }

    public int minpos(String s) {
        char leastChar = s.charAt(0);
        int index = 0;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) - leastChar < 0) {
                leastChar = s.charAt(i);
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Test ms = new Test();
        String res = ms.sort("abc");
        System.out.println(res);
    }
}
