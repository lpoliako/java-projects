//calculates the volume for a sphere
import java.util.Scanner;
public class SphereVolume {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Purpose of SphereVolume is to return the volume of a sphere");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the diameter of the sphere: ");
		double diam = input.nextDouble();
		double radius = diam/2;
		double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
		System.out.println("The Volume of the sphere: " + volume);
		input.close();
	}

}
