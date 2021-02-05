package christensen_program2;

public class EquilateralTriangle extends Shape implements RegularPolygon{
	
//Shapes defaults size

	double length = 1;
	
//constructs the shape

	
	public EquilateralTriangle(double sideLength, String shapeColor) {
		this.length = sideLength;
		setColor(shapeColor);
	}
	
	public EquilateralTriangle(String shapeColor) {
		setColor(shapeColor);
	}
	
	public EquilateralTriangle(double sideLength) {
		this.length = sideLength;
	}
	
//command to call the length
	
	public double length() {
		return length;
	}
	
//commands that create area and perimeter
	
	@Override public double area() {

		return (.4330127019) * length *length;	
	}
	
	@Override public double perimeter() {	
		return length*3;	
	}
	
//How it organizes to print
	
	public String toString() {
		return ("Shape: Equilateral Triangle" + "\n" + "Color: " + getColor() + "\n" + "Side: " + length() + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter() + "\n");
	}
}