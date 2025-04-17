import java.util.Scanner;

class Switch{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the day:");
		String day = scan.nextLine();
		scan.close();
		if(day=="monday") {
			System.out.println("uff,its weekday");
		}
		else if (day=="tuesday") {
			System.out.println("uff,its weekday");
		}
		else if (day=="wednesday") {
			System.out.println("uff,its weekday");
		}
		else if (day=="thursday") {
			System.out.println("uff,its weekday");
		}
		else if (day=="friday") {
			System.out.println("uff,its weekday");
		}
		else if (day=="saturday") {
			System.out.println("yah,its weekend");
		}
		else if (day=="sunday") {
			System.out.println("yah,its weekend");
		}
		else
			System.out.println("enter the correct day");
		

		}
	}
