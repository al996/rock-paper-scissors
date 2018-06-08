import java.util.Scanner;

//RockPaperScissors.java		Amy Liu
public class RockPaperScissors {

	public static void main(String[] args) {
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		final int WINSCORE = 2;
		final int NUMCHOICES = 3;
		final int FIRSTCHOICE = 1;
		int computerScore = 0;
		int playerScore = 0;
		int playerChoice;
		int computerChoice;
		String sRock = "Rock";
		String sPaper = "Paper";
		String sScissors = "Scissors";
		String sRepeat;
		char repeat;
		char yrepeat = 'y';
		char nrepeat = 'n';
		
		Scanner input = new Scanner(System.in);
		
		//Welcome message
		System.out.println("Welcome to " + sRock + ", "
				+ sPaper + ", "
				+ sScissors + ".");
		//Run code once before asking if player wants to play again
		do
		{
			//reset score board at start of each game
			computerScore = 0;
			playerScore = 0;
			//play game until player or computer wins
			do
			{
				//Menu
				System.out.println(ROCK + ". " + sRock
						+ "\n" + PAPER + ". " + sPaper
						+ "\n" + SCISSORS + ". " + sScissors);
				//Player Chooses, Keep asking until player inputs 1, 2, or 3
				do
				{
					System.out.print("Choose your weapon ("
							+ ROCK + ", "
							+ PAPER + ", or "
							+ SCISSORS + "): ");
					playerChoice = input.nextInt();
					//If Player doesn't choose 1, 2, or 3
					if(playerChoice != ROCK && playerChoice != PAPER && playerChoice != SCISSORS)
					{
						System.out.print("Invalid choice.  ");
					}
				}while(playerChoice != ROCK && playerChoice != PAPER && playerChoice != SCISSORS);
				System.out.print("\nChoice: ");
				//Prints Player's corresponding string to int value
				if(playerChoice == ROCK)
				{
					System.out.println(sRock);
				}
				else if(playerChoice == PAPER)
				{
					System.out.println(sPaper);
				}
				else if(playerChoice == SCISSORS)
				{
					System.out.println(sScissors);
				}
				
				//Computer Chooses
				computerChoice = (int)(Math.random() * NUMCHOICES + FIRSTCHOICE);
				System.out.print("Computer: ");
				//Prints Computer's corresponding string to int value
				if(computerChoice == ROCK)
				{
					System.out.println(sRock);
				}
				else if(computerChoice == PAPER)
				{
					System.out.println(sPaper);
				}
				else if(computerChoice == SCISSORS)
				{
					System.out.println(sScissors);
				}
					//Spacing before results
					System.out.println();
				
				
				//Win Conditions
				//Tie if same choice
				if(playerChoice == computerChoice)
				{
					System.out.println("Tie!!");
				}
				//Player chooses rock
				else if(playerChoice == ROCK)
				{
					//Computer chooses scissors --> win
					//Increase Player Score
					if(computerChoice == SCISSORS)
					{
						System.out.println("You win that round!!");
						playerScore++;
					}
					//Computer chooses paper --> lose
					//Increase Computer Score
					if(computerChoice == PAPER)
					{
						System.out.println("Computer wins that round.");
						computerScore++;
					}
				}
				//Player chooses paper
				else if(playerChoice == PAPER)
				{
					//Computer chooses rock --> win
					//Increase Player Score
					if(computerChoice == ROCK)
					{
						System.out.println("You win that round!!");
						playerScore++;
					}
					//Computer chooses scissors --> lose
					//Increase Computer Score
					if(computerChoice == SCISSORS)
					{
						System.out.println("Computer wins that round.");
						computerScore++;
					}
				}
				//Player chooses scissors
				else if(playerChoice == SCISSORS)
				{
					//Computer chooses paper --> win
					//Increase Player Score
					if(computerChoice == PAPER)
					{
						System.out.println("You win that round!!");
						playerScore++;
					}
					//Computer chooses rock --> lose
					//Increase Computer Score
					if(computerChoice == ROCK)
					{
						System.out.println("Computer wins that round.");
						computerScore++;
					}
				}
				
				//Score Report
				System.out.println("Score: " + playerScore + " - " + computerScore);
					//Spacing if game over
					if(playerScore < WINSCORE && computerScore < WINSCORE)
					{
						System.out.println("\n");
					}
			//Stop when either player or computer reaches win score
			}while(playerScore < WINSCORE && computerScore < WINSCORE);
			
			//Winner
			//Player wins
			if(playerScore > computerScore)
			{
				System.out.println("GAME OVER.  You won!!");
			}
			//Computer wins
			else if(computerScore > playerScore)
			{
				System.out.println("GAME OVER.  You lost.");
			}
			
			//ask whether player wants to play again until player enters y or n
			do
			{
				System.out.print("Play again ("
						+ yrepeat + "/"
						+ nrepeat + ")? ");
				sRepeat = input.next();
				sRepeat = sRepeat.toLowerCase();
				//if player doesn't input y or n
				if(!sRepeat.equals("y") && !sRepeat.equals("n"))
				{
					System.out.print("Invalid Input.  ");
				}
			}while(!sRepeat.equals("y") && !sRepeat.equals("n"));
			repeat = sRepeat.charAt(0);
				//Spacing if play again
				if(repeat == yrepeat)
				{
					System.out.println("\n\n");
				}
		//play again if player enter y
		}while(repeat == yrepeat);
		//Stopped Playing Message
		System.out.println("Goodbye...");
		input.close();
	}

}
