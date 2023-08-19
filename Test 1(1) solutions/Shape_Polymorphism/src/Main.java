
public class Main {

	public static void main(String[] args) {
		Shape[] shape = new Shape[3];
		shape[0]=new Circle(3);
		shape[1]=new Rectangle(9,6);
		shape[2]=new Triangle(2,3,5,4);
		for(Shape a : shape) {
			a.CalculateArea();
			a.CalculatePerimeter();
		}

	}

}
