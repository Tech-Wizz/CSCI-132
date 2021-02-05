package christensen_program2;

public class ShapeDemo {

	public static void main(String[] args) {
		
		System.out.println("------------------------ Begining of Test ------------------------\n");

	
	//test three of each with different inputs
		
		System.out.println("Testing Squares..."+"\n");
		
		Shape mySquare = new Square(3.0, "green");
		System.out.println(mySquare);
		
		Shape mySquare1 = new Square(4.0);
		System.out.println(mySquare1);
		
		Shape mySquare2 = new Square("yellow");
		System.out.println(mySquare2);
		
		System.out.println("Testing Circles..."+"\n");
		
		Shape myCircle = new Circle(5.0, "pink");
		System.out.println(myCircle);
		
		Shape myCircle1 = new Circle(6.5);
		System.out.println(myCircle1);
		
		Shape myCircle2 = new Circle("purple");
		System.out.println(myCircle2);
		
		System.out.println("Testing Equilateral Triangles..."+"\n");
		
		Shape myEquilateralTriangle = new EquilateralTriangle(27.0, "orange");
		System.out.println(myEquilateralTriangle);
		
		Shape myEquilateralTriangle1 = new EquilateralTriangle(11);
		System.out.println(myEquilateralTriangle1);
		
		Shape myEquilateralTriangle2 = new EquilateralTriangle("lime green");
		System.out.println(myEquilateralTriangle2);
		
	//rectangle is ran 5 times due to a more complex shape
		
		System.out.println("Testing Rectangles..."+"\n");
		
		Shape myRectangle = new Rectangle(9.0, 4.0, "violet");
		System.out.println(myRectangle);
		
		Shape myRectangle1 = new Rectangle(5);
		System.out.println(myRectangle1);
		
		Shape myRectangle2 = new Rectangle("hot pink");
		System.out.println(myRectangle2);
		
		Shape myRectangle3 = new Rectangle(3,2);
		System.out.println(myRectangle3);
		
		Shape myRectangle4 = new Rectangle(4,"bright blue");
		System.out.println(myRectangle4);

		System.out.println("------------------------ End of Test ------------------------");
	}

}
