import java.util.Scanner;

class Conditional{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the day:");
		String day = scan.nextLine();
		if(day=="monday") {
			System.out.println("uff, its a weekday");
		}
		
		else if(day=="sunday"){
			System.out.println("yah, its a weekend");
		}
		else
			System.out.println("invalid day");
		scan.close();
		
	}}