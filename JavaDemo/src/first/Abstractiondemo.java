package first;

public class Abstractiondemo {

	public static void main(String[] args) {
		animal obj =new farm();
		obj.tiger();
		obj.sheep();
		obj.dog();

	}

}
abstract class animal {
	public abstract void tiger();
	public abstract void sheep();
	public abstract void dog();
}