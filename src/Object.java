
public class Object {
	int i=10;
	int j=30;
	public Object() {
	}
	public Object(int i, int j) {
		this.i=i;
		this.j=j;
	}
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object(30,20);
		Object obj3 = new Object(40,60);
		
		System.out.println(obj1.add());
		System.out.println(obj2.add());
		System.out.println(obj3.add());
		
	}
	public int add() {
		return i+j;
	}

}
