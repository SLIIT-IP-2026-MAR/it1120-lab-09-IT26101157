import java.util.Scanner;
public class IT26101157Lab9Q2{
		public static void main(String[] args){
			//create scanner object for input
			Scanner scn=new Scanner(System.in);
			
			//get radius value from user
			System.out.print("Enter the radius of the circle: ");
			double radius=scn.nextDouble();
			
			//call circleArea method print area value
			double area=circleArea(radius);
			System.out.println("The area of the circle with radius "+radius+"is: "+area);
			
		}
		//method to calculate the area of a circle
		public static double circleArea(double radius){
			return Math.PI*radius*radius;
		}
}