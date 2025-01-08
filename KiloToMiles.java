import java.util.*;
public class KiloToMiles{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Distance in Kilometer: ");
		double kilometer = sc.nextDouble();
		double miles = kilometer * 0.621371;
		System.out.println(miles);
	}	
}