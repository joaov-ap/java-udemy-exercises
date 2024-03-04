package Program;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);
        while (answer != 'y' && answer != 'n') {
            System.out.print("Insert a valid answer Y or N: ");
            answer = sc.next().charAt(0);
        }

        if (answer == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(accountNumber, accountHolder, initialDeposit);
        } else {
            bank = new Bank(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        bank.setBalance(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(bank);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        bank.setWithdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(bank);

        sc.close();
    }
}