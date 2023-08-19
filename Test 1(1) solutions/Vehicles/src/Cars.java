
class Cars implements Vehicle {
	@Override
	public void start() {
		System.out.println("Start the car ");
	}
	@Override
	public void accelerate() {
		System.out.println("Accelerate the car ");
	}
	@Override
	public void brake() {
		System.out.println("Stop the car ");
	}

}
