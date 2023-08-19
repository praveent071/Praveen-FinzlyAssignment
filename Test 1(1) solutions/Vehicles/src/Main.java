
public class Main {
	public static void main(String [] args) {
		Vehicle [] vec = new Vehicle[2];
		vec [0] = new Cars();
		vec [1] = new Motorcycle();
		for(Vehicle a:vec) {
			a.start();
			a.accelerate();
			a.brake();
		}
		
	}

}
