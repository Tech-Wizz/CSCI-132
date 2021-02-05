package christensen_program2;

public class Square extends Shape implements RegularPolygon{
	
//Shapes defaults size
	
	double length = 1;
	
//constructs the shape
	
	public Square(double sideLength, String shapeColor) {
		this.length = sideLength;
		setColor(shapeColor);
	}
	
	public Square(String shapeColor) {
		setColor(shapeColor);
	}
	
	public Square(double sideLength) {
		this.length = sideLength;
	}
	
//command to call the length
	
	public double length() {
		return length;
	}

//commands that create area and perimeter
	
	@Override public double area() {	
		return length*length;	
	}
	
	@Override public double perimeter() {	
		return length*4;	
	}
	
//How it organizes to print
	
	public String toString() {
		return ("Shape: Square" + "\n" + "Color: " + getColor() + "\n" + "Side: " + length() + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter() + "\n");
	}
}

