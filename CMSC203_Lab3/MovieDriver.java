/* The program creates a movie object
 * Sets its title, rating, and number of tickets sold
 * Asks the user if they want to continue
 * */
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yesOrNo = 0;
		do {
		Scanner input = new Scanner(System.in);
		Movie newMovie = new Movie();
		System.out.print("Enter movie title: ");
		newMovie.setTitle(input.next());
		System.out.print("Enter movie rating: ");
		newMovie.setRating(input.next());
		System.out.print("Enter number of tickets sold at the theater: ");
		newMovie.setSoldTickets(input.nextInt());
		System.out.println(newMovie);
		System.out.print("Do you want to enter another? (y or n): ");
		String NoOrYes = input.next();
		yesOrNo = NoOrYes.equals("n") ? 1 : 0;
		}
		while(yesOrNo == 0);
		System.out.println("Goodbye");
	}

}
