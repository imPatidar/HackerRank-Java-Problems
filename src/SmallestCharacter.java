import java.util.Scanner;

public class SmallestCharacter {
    static char findSmallChar(String a){
        char min = 'z';
        int n = a.length();
        for (int i = 0; i < n-1; i++) {
            if (a.charAt(i)< min) {
                min = a.charAt(i);

            }
        }

        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        System.out.println(findSmallChar(inp));
    }
}
