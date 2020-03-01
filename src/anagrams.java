import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a, b;
        a = sc.nextLine();
        b = sc.nextLine();

        System.out.println(countManipulations(a,b));

    }

    public static int countManipulations(String a, String b) {

        int count = 0;
        int c_c[] = new int[26];

        for (int i = 0; i < a.length() ; i++) {
            c_c[a.charAt(i)-'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            if(c_c[b.charAt(i)-'a']--<=0)
                count++;

        }

        return count;

    }
}
