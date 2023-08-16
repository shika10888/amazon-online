package login;

public class Overloading {

	public static void main(String[] args) {
	Overloading obj = new Overloading();
	System.out.println(obj.sum(5, 3));
	System.out.println(obj.sum(2, 5, 8));
	

	}
   public int sum(int a, int b) {
	   
	      
	   int c =a+b;
	   return c;
   }   
   
  public int sum(int a, int b, int d) {
	   
	      
	   int c =a+b+d;
	   return c;
}
}
