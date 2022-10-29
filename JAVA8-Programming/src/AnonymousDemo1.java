
 interface Person1
 {
	  public void eat();
 }



public class AnonymousDemo1 {

	public static void main(String[] args) {
		
	   Person1 p1 = new Person1() { 
		   
		   public void eat() {
			   System.out.println("Rich Food");
		   }
	   };
	   p1.eat();
	}

}
