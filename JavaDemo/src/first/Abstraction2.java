package first;

public class Abstraction2 {

	public static void main(String[] args) {
		
	}

}
abstract class jungle extends animal{
	public void tiger() {
		int a=20;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
}
class farm extends jungle{
	public void sheep() {
		int a=10,b=20,c=a+b;
		System.out.println(c);
	}
	public void dog() {
		System.out.println("yes");
	}
}