

import java.util.Scanner;

public class Operations {
	double balance = 0.00;
	int deposit;
	int withdraw;
	int transfer;

	Scanner scan = new Scanner(System.in);

	public void deposits() {
		System.out.println("Enter amount to deposit: ");
		int d = scan.nextInt();
		if(d>0) {
			deposit += d;
			balance += d;
			System.out.println("Amount deposited successfully");
			System.out.println("Current Balance= " + balance);
			System.out.println("-----------------------------------");
		}
		else {
			System.out.println("Amount can't be negative");
			System.out.println("-----------------------------------");
		}
	}

	public void withdraws() {
		System.out.println("Enter amount to withdraw: ");
		int w = scan.nextInt();
		if(balance>=w) {
			withdraw += w;
			balance -= w;
			System.out.println("Amount withdrawn successfully");
			System.out.println("Current Balance= " + balance);
			System.out.println("-----------------------------------");
		}
		else {
			System.out.println("-----------------------------------");
			System.out.println("Insufficient balance");
			System.out.println("Current Balance= " + balance);
			System.out.println("-----------------------------------");
		}	
	}

	public void transfers() {
		while(true) {
			System.out.println("plz,Enter the Account Number");
			int accN1 = scan.nextInt();
			System.out.println("Enter the IFSC code");
			int ifsc = scan.nextInt();
			System.out.println("plz,Confirm the Account Number");
			int accN2 = scan.nextInt();
			if(accN1!=accN2) {
				System.out.println("Plz,Enter same Account Number");
				System.out.println("-----------------------------------");
			}
			else {
				System.out.println("Enter the amount to transfer");
				int t =scan.nextInt();
				if(balance>=t) {
					transfer +=t;
					balance -= t;
					System.out.println("Amount transferred successfully");
					System.out.println("Current balance= " + balance);
					System.out.println("-----------------------------------");
					break;
				}
				else {
					System.out.println("Insufficient balance");
					System.out.println("Current Balance= " + balance);
					System.out.println("-----------------------------------");
				}
			}
		}

	}

	public void historys() {
		System.out.println("Transfer History");
		System.out.println("-----------------------------------");
		System.out.println("Current Balance= " + balance);
		System.out.println("credited= " + deposit );
		System.out.println("debited= " + withdraw);
		System.out.println("Transfer= " + transfer);
		System.out.println("-----------------------------------");
	}
}
