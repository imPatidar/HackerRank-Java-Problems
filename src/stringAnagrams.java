import java.util.*;
import java.util.ArrayList;

public class stringAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function


//        Simple Way
//        List<Character> chars1= new ArrayList<>();
//        List<Character> chars2=new ArrayList<>();
//        //Converting String to List
//        for(char ch: a.toCharArray()){
//            chars1.add(ch);
//        }
//        //converting List to Set
//        Set<Character> s1=new HashSet<>();
//        for(Character x: chars1){
//            s1.add(x);
//        }
//        //Same for String 2
//        for(char ch: b.toCharArray()){
//            chars2.add(ch);
//        }
//        Set<Character> s2=new HashSet<>();
//        for(Character x: chars2){
//            s2.add(x);
//        }
//        if(s1==s2){
//            return true;
//        }else {
//            return false;
//        }

        char[] ca = a.toLowerCase().toCharArray();
        char[] cb = b.toLowerCase().toCharArray();

        java.util.Arrays.sort(ca);
        java.util.Arrays.sort(cb);
        return (new String(ca)).equals(new String(cb));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}