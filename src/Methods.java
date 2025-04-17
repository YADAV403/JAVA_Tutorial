
public class Methods {
	static int currentbalance = 1000;
	public static void greet() {
		System.out.println("hello,customer");
	}
	public void deposit(int amount) {
		currentbalance = currentbalance + amount;
		System.out.println("amount deposited successfully");
	}
	public static void withdraw(int amount) {
		currentbalance = currentbalance - amount;
		System.out.println("amount withdrawn successfully");
	}
	public int currentbalance() {
		return currentbalance;
		
	}
	public static void main(String[] args) {
		Methods var = new Methods();
		greet();
		System.out.println("currentbalance:"+currentbalance);
		var.deposit(500);
		System.out.println("currentbalance:"+currentbalance);
		withdraw(400);
		System.out.println("currentbalance:"+currentbalance);
	}

}
