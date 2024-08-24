package programs.Day8;


class Vehicle{
	//String arr[] = new String[5];
}

class Car extends Vehicle{
	
}

class Bus extends Vehicle{
	
}


public class DerivedClass {
	public static void main(String[] args) {
		Vehicle[] arr = new Vehicle[5];
		 arr[0] = new Vehicle();
		 arr[1] = new Car();
		 arr[2] = new Bus();
	}

	
}
