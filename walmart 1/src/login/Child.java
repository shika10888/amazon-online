package login;

public class Child extends Parent {

	public static void main(String[] args) {
		Parent obj = new Child ();  // Top Casting
		obj.details();
	Child obj1 = (Child) new Parent();// down casting
		
		// common in parent & child or only in parent

	}

	
     // Method Overriding	
	
	public void details() {
		System.out.println("details from Child");
	}
	public void job() {
		System.out.println("My job is QA");
		
		
	}
}
