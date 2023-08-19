
public interface Shape {
	public abstract void CalculateArea();
	public abstract void CalculatePerimeter();

}
class Circle implements Shape{
	private int radius;
	public Circle(int radius) {
		this.radius= radius;
	}
	@Override
	public void CalculateArea() {
		System.out.println(3.14*radius*radius);
		
	}
	@Override
	public void CalculatePerimeter() {
		System.out.println(2*3.14*radius);
		
	}
}
class Rectangle implements Shape{
	private int H;
	private int W;
	public Rectangle(int W, int H) {
		this.H=H;
		this.W=W;
	}
	@Override
	public void CalculateArea() {
		System.out.println(H*W);
		
	}
	@Override
	public void CalculatePerimeter() {
		System.out.println((H+W)*2);
		
	}
}
class Triangle implements Shape{
	private int b;
	private int h;
	private int a;
	private int c;
	public Triangle(int a,int b, int c,int h) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.h=h;
	}
	@Override
	public void CalculateArea() {
		System.out.println(0.5-b*h);
		
	}
	@Override
	public void CalculatePerimeter() {
		System.out.println(a+b+c);
		
	}
}
