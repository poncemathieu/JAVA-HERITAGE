
public class Car extends Vehicle {
	
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
		
	}
	@Override
	public String doStuff() {
		return "je suis " + this.getBrand() + " et je fait vroum vroum";
	}

}
