package programs.Day7;

class Product{
	int id;
	String name;
	
	Product(int id){
		this.id = id;
	}
	
	void display() {
		System.out.println("Product.display()");
	}
	
	/*public String toString() {
		return (name);
	}*/
	
	public boolean equals(Object obj) {
		 Product p = (Product)obj;
		if(this.id == p.id)
		return true;
		
		return false;
		
	}
	
}

class ElectronicProduct extends Product {
	
	ElectronicProduct(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	float voltage;
	void display() {
		System.out.println("ElectronicProduct.display()");
	}
}

public class OverrideEg {
	
	public static void main(String[] args) {
		Product obj = new ElectronicProduct(11);
		/*Method Overriding
		 * Dynamic Polymorphism - run time decision
		 * */
		
		obj.display(); //display of derived
		System.out.println("Product obj is : " + obj);
		Product obj1 = new Product(11);
		Product obj2 = new Product(12);
		obj1.display(); //display of base
		
		System.out.println("Product obj1 is : " + obj1);
		System.out.println("Product obj2 is : " + obj2);
		System.out.println(obj1.equals(obj2));

	}
}


