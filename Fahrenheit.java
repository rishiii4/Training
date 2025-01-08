import java.util.*;
public class Fahrenheit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Celcius :");
		int celcius = sc.nextInt();
		int fahrenheit = (celcius * 9/5) + 32;
		System.out.print(fahrenheit);
	}	
}