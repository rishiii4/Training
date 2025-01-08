import java.util.*;
public class VolumeOfCylinder{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius :");
		int radius = sc.nextInt();
		System.out.println("Enter the Height :");
		int height = sc.nextInt();
		int volume = 3.14 * (radius*radius) * height;
		System.out.print(volume);
	}	
}