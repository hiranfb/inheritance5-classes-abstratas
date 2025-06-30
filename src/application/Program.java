package application;

import java.util.List;
import java.util.ArrayList;

import entities.Account;
import entities.SavingsAccount;
import entities.BusinessAccount;

public class Program {
	public static void main(String[] args) {
		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f%n", sum);
		System.out.println();

		for (Account acc : list) {
			acc.deposit(10.0);
		}

		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}