package christensen_program2;

public class Circle extends Shape implements RegularPolygon{
	
	//Shapes defaults size
	
	double length = 1;
	
//constructs the shape
	
	public Circle(double radiusLength) {
		this.length = radiusLength;
	}
	
	public Circle(double radiusLength, String shapeColor) {
		this.length = radiusLength;
		setColor(shapeColor);
	}
	
	public Circle(String shapeColor) {
		setColor(shapeColor);
	}
	
//command to call the length
	
	public double length() {
		return length;
	}
	
//commands that create area and perimeter
	
	@Override public double area() {	
		return 3.1415926535*length*length;	
	}
	
	@Override public double perimeter() {	
		return 3.1415926535*length*2;	
	}
	
//How it organizes to print
	
	public String toString() {
		return ("Shape: Circle" + "\n" + "Color: " + getColor() + "\n" + "Side: " + length() + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter() + "\n");
	}
}
