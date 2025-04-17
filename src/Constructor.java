
public class Constructor {
	public static void main(String[] args) {
		Constructor con = new Constructor(100);
	}
	public Constructor() {
		int a=10;
		System.out.println(a);
	}
	public Constructor(int a) {
		System.out.println(a);
	}
}
