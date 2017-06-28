package session4;

public class TestShirt {
		
	public static void main(String[] args) {
		//creating object using default constructor
		Shirt shirt1 = new Shirt();
		
		//creating objects using parameterized constructor
		Shirt shirt2 = new Shirt(6.0f,8.8f);
		Shirt shirt3 = new Shirt (7.0f,9.2f);
		
		System.out.println("**************Details of Shirt 1******************");
		shirt1.display();
		System.out.println("**************Details of Shirt 2******************");
		shirt2.display();
		System.out.println("**************Details of Shirt 3******************");
		shirt3.display();
		

	}
	
	

}
