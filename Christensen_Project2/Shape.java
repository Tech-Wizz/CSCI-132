package christensen_program2;

public abstract class Shape {

//set the default color and changes it when prompted 
	
	private String color = "white";
	
	public void setColor(String shapeColor){
		this.color = shapeColor;
	}
	public String getColor() {
		return color;
	}
	
//For the polymorphism
	
	abstract public double area();
	abstract public double perimeter();
	abstract public double length();
	abstract public double width();
	abstract public String toString();
}
