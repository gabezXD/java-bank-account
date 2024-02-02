package app;

import entities.Account;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Account account;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        // System.out.println(sc.nextLine());
        System.out.print("Enter account holder's name: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a initial deposit? (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter the initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(holder, number, initialDeposit);
        }
        else {
            account = new Account(holder, number);
        }

        
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(account);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(account);



        sc.close();
    }
}
