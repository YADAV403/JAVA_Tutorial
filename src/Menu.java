

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {

		Operations op = new Operations();

		Scanner sc = new Scanner(System.in);

		int id = 2377;
		int pin = 9847;
		while(true) {
			System.out.println("Enter the User ID:");
			int uid = sc.nextInt();
			System.out.println("-----------------------------------");
			if(id==uid) {
				while(true) {
					System.out.println("Enter the PIN Number:");
					int p = sc.nextInt();
					System.out.println("-----------------------------------");
					if(pin==p) {
						System.out.println("Successfully Logged into the Account");
						System.out.println("-----------------------------------");
						while(true) {
							System.out.println();
							System.out.println();
							System.out.println("WELCOME TO ATM SERVICE CENTER");
							System.out.println("-----------------------------------");
							System.out.println("1. Deposit");
							System.out.println("2. Withdraw");
							System.out.println("3. Transfer");
							System.out.println("4. Transaction History");
							System.out.println("5. Exit");
							System.out.println("-----------------------------------");
							System.out.println("Select one option from above:");

							int o = sc.nextInt();
							System.out.println("-----------------------------------");
							switch(o) {
							case 1:
								op.deposits();
								break;
							case 2:
								op.withdraws();
								break;
							case 3:
								op.transfers();
								break;
							case 4:
								op.historys();
								break;
							case 5:
								System.out.println("Tq for comming. Plz visit again.....");
								System.exit(0);
								break;
							default:
								System.out.println("please choose the correct option.....");
								System.out.println("-----------------------------------");
							}
						}
					}
					else {
						System.out.println("Plz,Enter the correct PIN Number");
						System.out.println("-----------------------------------");
					}
				}
			}
			else {
				System.out.println("Plz,Enter the Correct ID");
				System.out.println("-----------------------------------");
			}

		}
	}
}
