import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String answer;
		
//		System.out.println("Arvaa minun nimi.");
//		answer = in.nextLine();
//
//		if (answer.equals("Masa"))
//		{
//			System.out.println("Onnittelut arvasit oikein!");
//		}
//		else
//		{
//			System.out.println("Arvaa uudelleen.");
//		}
		
		do
		{
			System.out.println("Guess my name");
			answer = in.nextLine();
			
			if (answer.equals("Masa"))
				{
				break;
				}
				else
				{
				System.out.println("Guess again");
				}
				
		} while (!answer.equals("Masa"));
		
		System.out.println("congratulations You Won!");
	}

}
