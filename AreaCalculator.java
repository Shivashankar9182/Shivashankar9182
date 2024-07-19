//Demonstration of a program using method overloading[a.Overload method area()]
public class AreaCalculator {
	
	//the class AreaCalculator the area of various shapes
	int length;
	int breadth;
	double radius;
	
	public static double area(int length) {
		
		System.out.println("Area of Square:");
		return length*length;//calculates and returns the Area of Square
		
	}
	public static double area(int length,int breadth) {
		
		System.out.println("Area of Rectangle:");
		return length*breadth;//calculates and returns the Area of a Rectangle
		
	}
	public static double area(double radius) {
		
		System.out.println("Area of circle:");
		return Math.PI*radius*radius;//calculates and returns the Area of a Circle(using Math.PI constant)
		
	}

	public static void main(String[] args) {
		AreaCalculator area=new AreaCalculator();
		System.out.println("lenght*length:"+area(5));//Square with side length 5
		System.out.println("length*breadth:"+area(5,8));//Rectangle with length 5 and breadth 8
		System.out.println("3.14*radius*radius:"+area(3.14));//Circle with radius 3.5
		
		
	}

}
