import java.text.DecimalFormat;
import java.util.Scanner;

public class interestRate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int id;
        double balance;
        double interestRate;

        id = sc.nextInt();
        balance = sc.nextDouble();
        interestRate = sc.nextDouble();
        int noOfYears = sc.nextInt();

        Account a = new Account(id, balance, interestRate);
        double interest = calculateInterestRate(a, noOfYears);

        DecimalFormat df = new DecimalFormat("0.000");
        String formate= df.format(interest);
        System.out.println(formate);
    }

    public static double calculateInterestRate(Account a, int noOfYears){

        double interest = a.getBalance() * (a.getInterestRate() + noOfYears*a.getInterestRate()/100)/100;
        return interest;
    }
}


class Account{
    private int id;
    private double balance;
    private double interestRate;

    public Account(int id, double balance, double interestRate){
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public double getBalance(){
        return balance;
    }
    public double getInterestRate(){
        return interestRate;
    }
}