import java.util.Scanner;
import java.util.ArrayList;

public class MonopolyRunner
	{
		// tester please ignore this comment
		static Scanner input = new Scanner(System.in);
		static Scanner inputInt = new Scanner(System.in);
		static String nameD2;
		static String nameD;
		static String nameR;
		static String nameR2;
		static String enter;
		static Player player1;
		static Player player2;


		public static void main(String[] args)
			{
				ChestRunner.shuffle();
				ChanceRunner.shuffle();
				System.out.println("Would you like to play Disnopoly or Regular?");
				System.out.println("(1) Disnopoly");
				System.out.println("(2) Regular");
				int DisOrReg = input.nextInt();
				if(DisOrReg == 1)
					{
					Disnopoly();
					}
				else
					{
					Regular();
					}
				
				while(MonopolyRunner.player1.getBalance() > 0)
					{
						
						MoveAround.startMoving();
						if(MonopolyRunner.player1.getBalance() <= 0)
							{
								System.out.println("You ran out of money, the game is over");
							}
						
					}
				


			}
		
		public static void Regular()
			{

			System.out.println("Hello and welcome to Monopoly! ");
			System.out.println("What is your name Player1? ");
			nameR = input.nextLine();
			player1 = new Player(nameR, 1500, 0);
			System.out.println("\nWelcome " + nameR + "!!");
			System.out.println("You start with $1500");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			//
			System.out.println("What is your name Player2? ");
			nameR2 = input.nextLine();
			player2 = new Player(nameR2, 1500, 0);
			System.out.println("\nWelcome " + nameR2 + "!!");
			System.out.println("You start with $1500");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			BoardArrayList.fillListTradition();
			
			}

		public static void Disnopoly()
			{

			System.out.println("Hello and welcome to Disnopoly! ");
			System.out.println("What is your name Player1? ");
			nameD = input.nextLine();
			player1 = new Player(nameD, 1500, 0);
			System.out.println("\nWelcome " + nameD + "!!");
			System.out.println("You start with $1500");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			BoardArrayList.fillListDisnopoly();
			
			
			System.out.println("Hello and welcome to Disnopoly! ");
			System.out.println("What is your name Player2? ");
			nameD2 = input.nextLine();
			player2 = new Player(nameD2, 1500, 0);
			System.out.println("\nWelcome " + nameD2 + "!!");
			System.out.println("You start with $1500");
			System.out.println("Press enter to start the game");
			enter = input.nextLine();
			BoardArrayList.fillListDisnopoly();
			

			}
		

		public static void PassGoMain()
			{

				// if(MoveAround.place == 0)

				if (MonopolyRunner.player1.getPlace() == 0)
					{
						PassGo.PassGo();
					}

			}

	}
