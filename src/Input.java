import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("hi wt is u r name?");
		String name = scan.nextLine();	
		System.out.printf("hey %s,hw r u?\n",name);
		String status = scan.nextLine();
		System.out.println("wt is ur age?");
		int age = scan.nextInt();
		System.out.println("tq for u r information");
		scan.close();
	}
		
		
	

}
