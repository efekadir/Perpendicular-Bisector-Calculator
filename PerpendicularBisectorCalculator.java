import java.util.Scanner;

public class PerpendicularBisectorCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x1 coordinate: ");
		double x1 = sc.nextDouble();
		
		System.out.print("Enter y1 coordinate: ");
		double y1 = sc.nextDouble();
		
		System.out.print("Enter x2 coordinate: ");
		double x2 = sc.nextDouble();
		
		System.out.print("Enter y2 coordinate: ");
		double y2 = sc.nextDouble();
		
		double midpointX = (x1 + x2) / 2;
		double midpointY = (y1 + y2) / 2;
		
		
		if (y1 == y2 && x1 == x2) {
			System.out.println("Points are same. There is no perpendicular bisector.");
		}
		else if (y1 == y2) {
			System.out.println("The equation of perpendicular bisector is: " + "x = " + midpointX);
		}
		else if (x1 == x2) {
			System.out.println("The equation of perpendicular bisector is: " + "y = " + midpointY);
		}
		else  {
			double slope = (y2 - y1) / (x2 - x1);
			double newSlope = -1 / slope;
			double n = (-1*newSlope*midpointX) + midpointY;
					
			if (n >= 0) {
				System.out.println("The equation of perpendicular bisector is: " + "y = " 
									+ newSlope + "x + " + n);
			}
			else if (n < 0){
				n = Math.abs(n);
				System.out.println("The equation of perpendicular bisector is: " + "y = " 
									+ newSlope + "x - " + n); 
			}	 
		}
	}
}