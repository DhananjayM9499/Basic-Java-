package cdac.in;

import java.util.*;

class BankDetails {
	static Scanner scan = new Scanner(System.in);
	String Name;
	String AcNumber;
	int BankBalance;

	public void Customer() {

		System.out.println("Enter your name");
		Name = scan.next();
		System.out.println("Enter your account number");
		AcNumber = scan.next();
		System.out.println("Enter your bank balance");
		BankBalance = scan.nextInt();

	}

	public void DisplayDetails() {
		System.out.println("A/c Holder Name : " + Name);
		System.out.println("Account Number : " + AcNumber);
		System.out.println("Your Bank balance is " + BankBalance + "/-");
	}

	boolean search(String account) {
		if (AcNumber.equals(account)) {
			DisplayDetails();
			return (true);
		}
		return (false);
	}

	public void Deposit() {
		int Amount;
		System.out.println("Enter amount you want to Deposit : ");
		Amount = scan.nextInt();
		BankBalance = BankBalance + Amount;

	}

	public void Withdrawl() {
		int Amount;
		System.out.println("Enter amount you want to withdrawl");
		Amount = scan.nextInt();
		if (BankBalance >= Amount) {
			BankBalance = BankBalance - Amount;
		} else {
			System.out.println("Low Balance \n Transaction Failed..");
		}
	}

}

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("--------Welcome to CDAC Bank of India--------");

		System.out.print("How Many Customer you want to Input : ");
		int n = scan.nextInt();
		BankDetails customer[] = new BankDetails[n];
		for (int i = 0; i < customer.length; i++) {
			customer[i] = new BankDetails();
			customer[i].Customer();
		}

		int choice;
		do {
			System.out.println("Main Menu");
			System.out.println("1. Display Customer Details\n 2. Search By Account no.\n 3. Deposit\n 4. Withdrawal\n 5.Exit ");
			System.out.println("Enter your  Choice :");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < customer.length; i++) {
					customer[i].DisplayDetails();
				}
				break;

			case 2:
				System.out.print("Enter Account No U Want to Search...: ");
				String account = scan.next();
				boolean found = false;
				for (int i = 0; i < customer.length; i++) {
					found = customer[i].search(account);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Search Failed..Account Not Exist..");
				}
				break;

			case 3:
				System.out.print("Enter Account No : ");
				account = scan.next();
				found = false;
				for (int i = 0; i < customer.length; i++) {
					found = customer[i].search(account);
					if (found) {
						customer[i].Deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Search Failed..Account Not Exist..");
				}
				break;

			case 4:
				System.out.print("Enter Account No : ");
				account = scan.next();
				found = false;
				for (int i = 0; i < customer.length; i++) {
					found = customer[i].search(account);
					if (found) {
						customer[i].Withdrawl();
						break;
					}
				}
				if (!found) {
					System.out.println("Search Failed..Account Not Exist..");
				}
				break;

			case 5:
				System.exit(0);
				System.out.println(" Have a good day");
				
				break;
			}
			System.out.println("Press Y to continue");
			choice = scan.next().charAt(0);

		}
	
		

		while (choice == 'Y' || choice == 'y');
		{
			System.out.println(" Have a good day");
		}

	}
}
