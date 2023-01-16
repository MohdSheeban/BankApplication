import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Enter your name, password, balance to create an account");

        String name = scan.next();
        String password = scan.next();
        double balance = scan.nextDouble();
        SBIUser user = new SBIUser(name,balance,password);
        System.out.println("Account Number: " + user.getAccountNo());
        System.out.println("Enter the amount you want to add: ");
        int moneyToBeAdded = scan.nextInt();
        String message = user.addMoney(moneyToBeAdded);
        System.out.println(message);

        System.out.println("Enter amount you want to withdraw: ");
        int money = scan.nextInt();
        System.out.println("Enter your password: ");
        String pass = scan.next();
        System.out.println(user.withdrawMoney(money,pass));

        System.out.println("The interest for 10 years on "+ user.getBalance() + " Rs will be: " + user.calculateInterest(10));
    }
}