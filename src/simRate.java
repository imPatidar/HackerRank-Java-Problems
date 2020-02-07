import java.util.Scanner;

class Solution {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        simRate[] s = new simRate[4];

        for (int i = 0; i < s.length; i++) {

            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double balance = sc.nextDouble();
            sc.nextLine();
            double rate = sc.nextDouble();
            sc.nextLine();
            String circle = sc.nextLine();
            s[i] = new simRate(id, name, balance, rate, circle);

        }

        String inputCircle = sc.nextLine();
        double inputRate = sc.nextDouble();

        simRate[] results = matchArea(s, inputCircle, inputRate);
        for (int j = 0; j < results.length; j++) {
            if (results[j] != null) {
                System.out.println(results[j].getId());
            }

        }
    }


    public static simRate[] matchArea(simRate[] sim, String inputCircle, double inputRate) {

        simRate[] temp = new simRate[4];
        int j = 0;

        for (int i = 0; i < sim.length; i++) {

            if (sim[i].getCircle().toLowerCase().equals(inputCircle.toLowerCase()) && sim[i].getRate() < inputRate) {
                temp[j++] = sim[i];
            }
        }
        //Sorting the Array

        for (int i = 0; i < j - 1; i++) {
            for (int k = 0; k < j - i - 1; k++) {
                if (temp[k].getBalance() < temp[k + 1].getBalance()) {
                    //Swap
                    simRate st = temp[k];
                    temp[k] = temp[k + 1];
                    temp[k + 1] = st;
                }
            }
        }
        return temp;

    }

}


public class simRate {
    int id;
    String name;
    double balance;
    double rate;
    String circle;


    public simRate(int id, String name, double balance, double rate, String circle) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.rate = rate;
        this.circle = circle;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public String getCircle() {
        return circle;
    }
}
