import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Wind Chill Calculator");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit (must be >= -45 and <= 40):");
		double tempValue = input.nextDouble();
		System.out.print("Enter the wind speed (must be >= 5 and <= 60):");
		double windValue = input.nextDouble();

		System.out.println("Wind chill temperature: " + windChillCalculator(tempValue, windValue) + " degrees Fahrenheit");
		System.out.println("Programmer: Lennard Poliakov");
		input.close();
	}

	public static double windChillCalculator(double temp, double wind) {
		double V = Math.pow(wind, 0.16);
		double value = 35.74 + 0.6215*temp - 35.75*V + 0.4275*temp*V;
		return value;
	}

}
