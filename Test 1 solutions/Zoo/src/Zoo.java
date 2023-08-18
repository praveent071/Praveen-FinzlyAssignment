import java.util.ArrayList;

class Zoo {
	private ArrayList <Animal> animals = new ArrayList<>();
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	public void makeallSound() {
		for(Animal animal : animals) {
			animal.makeSound();
		}
	}
}
	
