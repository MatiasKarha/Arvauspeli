import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		String answer;
		
		System.out.println("Guess my name");
		
		do
		{
			answer = in.nextLine();
			
			if (answer.equals("Loppu"))
			{
				break;
			}
			else if (!answer.equals("Masa"))
			{
				System.out.println("Guess again");
			}
				
		} while (!answer.equals("Masa"));
		
		System.out.println("congratulations You Won!");
	}

}
