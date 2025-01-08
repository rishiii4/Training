import java.util.*;
public class AverageOfThreeNums{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (a + b +c) / 2;
		System.out.print("Average is "+ d);
	}	
}