package session4;

public class Shirt {
	private float collar_size;
	private float sleeve_length;
	private String Shirt_material;
	
	//Default Constructor
	Shirt(){
		collar_size = 5.2f;
		sleeve_length = 6.5f;
		Shirt_material = "cotton"	;	
	}
	
	//Parameterized constructor that accepts collar size and sleeve length
	Shirt(float collar_size, float sleeve_length){
		this.collar_size = collar_size;
		this.sleeve_length = sleeve_length;
		this.Shirt_material = "cotton";
	}
	public float getCollar_size() {
		return collar_size;
	}
	public void setCollar_size(float collar_size) {
		this.collar_size = collar_size;
	}
	public float getSleeve_length() {
		return sleeve_length;
	}
	public void setSleeve_length(float sleeve_length) {
		this.sleeve_length = sleeve_length;
	}
	public String getShirt_material() {
		return Shirt_material;
	}
	public void setShirt_material(String shirt_material) {
		Shirt_material = shirt_material;
	}
	
	//Public method to display shirt details
	public void display(){
		System.out.println("Shirt collar size is "+this.getCollar_size()+"\nShirt Sleeve size is "+this.getSleeve_length()+"\nMaterial of the shirt is "+this.getShirt_material());
	}
	
	

}
