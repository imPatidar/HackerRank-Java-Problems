import java.util.Scanner;

public class perfectSquare {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a = sc.nextDouble();
        a=Math.sqrt(a);
        System.out.println(a-Math.floor(a)==0);
    }
}
