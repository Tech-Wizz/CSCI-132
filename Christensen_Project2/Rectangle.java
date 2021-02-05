package christensen_program2;

public class Rectangle extends Shape implements RegularPolygon{
	
//Shapes defaults size
	
	double length = 1;
	double width = 1;
	
//constructs the shape
	
	public Rectangle(double sideLength, double sideWidth) {
		this.length = sideLength;
		this.width = sideWidth;
	}
	
	public Rectangle(double sideLength, double sideWidth, String shapeColor) {
		this.length = sideLength;
		this.width = sideWidth;
		setColor(shapeColor);
	}
	
//set width to default for next two because it can't tell if the input is a length or width
	
	public Rectangle(double sideWidth, String shapeColor) {
		this.width = sideWidth;
		setColor(shapeColor);
	}
	
	public Rectangle(double sideWidth) {
		this.width = sideWidth;
	}
	
	public Rectangle(String shapeColor) {
		setColor(shapeColor);
	}
	
//command to call the length	
	
	public double length() {
		return length;
	}
	
//command to call the width
	
	public double width() {
		return width;
	}
	
//commands that create area and perimeter
	
	@Override public double area() {	
		return length*width;	
	}
	
	@Override public double perimeter() {	
		return length*2+width*2;	
	}
	
//How it organizes to print
	
	public String toString() {
		return ("Shape: Rectangle" + "\n" + "Color: " + getColor() + "\n" + "Width: " + width() +"\n" + "Height: " + length() + "\n" + "Area: " + area() + "\n" + "Perimeter: " + perimeter() + "\n");
	}
}
