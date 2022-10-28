package conditional_statements;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the year to check whether it is leap year or not");
		int year=scan.nextInt();
		if(year%4==0||year%400==0) {
			System.out.println("Leap year");
		}
		else {
			
			System.out.println("Not a leap year");
		}
		scan.close();
	}

}
