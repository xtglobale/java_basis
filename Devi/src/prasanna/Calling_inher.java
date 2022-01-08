package prasanna;

public class Calling_inher extends Example_inheritance {

	public void car() {
		System.out.println("bmw");
	}
	public static void main(String[] args) {
	
		System.out.println("inheritance");
	
		 Example_inheritance e=new  Example_inheritance();
		 Calling_inher c=new Calling_inher();
		 e.vehicle();
		 c. car();
	}
}