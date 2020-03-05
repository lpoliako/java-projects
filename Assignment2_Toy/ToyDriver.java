import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Random;
public class ToyDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Assignment 2: Toy");
		Toy myToy = new Toy();
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		double totalCost = 0;
		do {
			int bypass;
			String name;
			do {
				bypass = 0;
				myToy = new Toy();
				name = JOptionPane.showInputDialog("Enter name");
				String age = JOptionPane.showInputDialog("Enter age");
				myToy.setAge(Integer.parseInt(age));
				String toy = JOptionPane.showInputDialog("Enter Toy Choice (plushie, book, or blocks)");
				myToy.setToy(toy);
				myToy.setCost(toy);
				if (!(myToy.ageOK())) 
				{
					if (JOptionPane.showInputDialog("Toy not age appropriate. Do you want to change? (Yes/No):").equals("No"))
					{
						bypass=1;
					}	
				}
				else 
				{
					bypass = 1;
				}
				}while(bypass != 1);
			myToy.addCard(JOptionPane.showInputDialog("Do want to add a gift card? (Yes/No)"));
			myToy.addBalloon(JOptionPane.showInputDialog("Do want to add a balloon? (Yes/No)"));
			totalCost += myToy.getCost();
			System.out.println("The gift for " + name + myToy);
		}while(JOptionPane.showInputDialog("Do you want to add another gift? (Yes/No)").equals("Yes"));
		System.out.println("The total cost of your order is: $" + dollar.format(totalCost));
		Random rand = new Random();
		int num = rand.nextInt(89999)+10000;
		System.out.println("Order number is " + num);
		System.out.println("Programmer: Lennard Poliakov");
	}
}



