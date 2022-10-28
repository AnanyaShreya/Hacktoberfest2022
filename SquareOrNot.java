package conditional_statements;

import java.util.Scanner;

public class SquareOrNot {

	public static void main(String[] args) {
		//Take values of length and breadth of a rectangle from user and check if it is square or not.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length");
		float length=scan.nextFloat();
		
		System.out.println("Enter breadth");
		float breadth=scan.nextFloat();
		
		if(length==breadth) {
			System.out.println("Given rectangle is a square");
			
		}
		else {
			System.out.println("Given rectangle is not square");
		}
				
		scan.close();
	}

}
