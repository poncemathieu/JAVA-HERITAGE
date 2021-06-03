
public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mercedes = new Car("Mercedes", 1000);
		Boat bateau = new Boat("Bateau", 1500);
		
		System.out.println(mercedes.doStuff());
		System.out.println(bateau.doStuff());
	}

}
