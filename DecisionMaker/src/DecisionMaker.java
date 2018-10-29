import java.util.Scanner;
public class DecisionMaker
	{

		public static void main(String[] args)
			{
				decisionMaker();

			}
		public static void decisionMaker()
		{
			Scanner userInputOne = new Scanner(System.in);
			System.out.println("Whats your name?");
			String userName = userInputOne.nextLine();
			System.out.println("Ok " + userName + " how many choices do you have?");
			Scanner userInputTwo = new Scanner(System.in);
			int numberChoices = userInputTwo.nextInt();
			String [] choices = new String[numberChoices];
			
			for (int i = 0; i <numberChoices; i++)
				{
					System.out.println("What's choice " + (i +1));
					String inputChoice = userInputOne.nextLine();
					choices[i] = inputChoice;
				}
			String randomChoice = choices[(int)(Math.random()*numberChoices)];
			System.out.println("Choose " + randomChoice);
		}

	}
