package AfterWork;

import java.util.*;

public class AfterWork 
{
	// Used to measure energy for sleep.
	private static final int OPTIMAL = 70;
	
	// Enables the scanner
	static Scanner console = new Scanner(System.in);
	
	// Holds energy, happiness, money and choice.
	static int choice = 0;

	// Player name and answer
	static String name, answer;

//	// Modifies and keeps track of player attributes while game is in play
//	static void updateStats(int amtEnergy, int amtHappiness, int amtMoney)
//	{
//		person.energy += amtEnergy;
//		happiness += amtHappiness;
//		money += amtMoney;
//
//		System.out.println("Happiness level: " + happiness);
//		System.out.println("Money left     : " + money);
//
//	};
	
	// Displays cranky or happy
	static void mood(int amtHappiness)
	{
		if (amtHappiness < OPTIMAL)
		{
			System.out.println("You didn't have enough fun and now you are cranky... >_< \n");
		}
		else 
			System.out.println("You had so much fun yesterday and can't wipe the smile off your face ^____^\n");
	}
	
	// Money validation
//	static void moneyEnough ()
//	{
//		
//	}


	public static void main(String[] args) 
	{
		// GAME disclaimer...
		System.out.println("****************************DISCLAIMER**********************************");
		System.out.println("\nThis is a work of fiction. Names, characters, businesses, places, \n"
				+ "events, locales, and incidents are either the products of the author’s \n"
				+ "imagination or used in a fictitious manner. Any resemblance to actual \n"
				+ "persons, living or dead, or actual events is purely coincidental. This \n"
				+ "project is an example of what you get when you don't set any parameters. \n"
				+ "By playing this game you agree to these terms.\n");
		
		// Get player name
		System.out.println("Please enter your name:");
		name = console.nextLine();
		
		Person instructor = new Person(name);
		
		// Narrative
		System.out.println("\nYou are " + name + " an instructor from Dallas working in Boston, teaching \n"
				+ "a scrum master course. You have finished your first day teaching \n"
				+ "your wicked smaht cohort. You head out of the building and find \n"
				+ "a hundred bucks on the ground! Now it's time for some fun!.\n");
		
		instructor.setStats(0,0,0);
		
		// Menu system for player's choices.
		do {
			System.out.println("\nWhat do you wanna do? ");
			System.out.println("1.) Go to the Union Oystah House for Chowdah ($10)");
			System.out.println("2.) Go to Hahvuhd Squayuh and get a Hahvuhd sweatshirt ($20)");
			System.out.println("3.) Catch a Red Sox game ($30)");
			System.out.println("4.) Check out the Public Gahdens and go on the swan boats ($10)");
			System.out.println("5.) Party time at Faneuil Hall! ($30)");
			System.out.println("6.) Be boring and head back to the hotel");
			System.out.println("Please enter a number 1 - 6: ");

			choice = console.nextInt();

			switch(choice) 
			{
			case 1:
				if (Person.getMoney() >= 10)
				{
				System.out.println("That was some damn good Chowdah!\n");
				instructor.setStats(-10, 10, -10); // Energy, Happiness, Money
				}
				else
					System.out.println("Not enough money");
				break;
				
			case 2:
				if (Person.getMoney() >= 20)
				{
				System.out.println("You wear your sweatshirt and pretend to be a Hahvuhd student.\n");
				instructor.setStats(-10, 10, -20); // Energy, Happiness, Money
				}
				else
					System.out.println("Not enough money");
				break;
				
			case 3:
				if (Person.getMoney() >= 30)
				{
				System.out.println("The Red Sox play the Texas Rangers and the Sox win!\n"
						+ "You've been converted to a Red Sox fan, beacuse they are awesome.\n");
				instructor.setStats(-10, 80, -30); // Energy, Happiness, Money
				}
				else
					System.out.println("Not enough money");
				break;
				
			case 4:
				if (Person.getMoney() >= 10)
				{
				System.out.println("You enjoy a scenic swan boat ride\n");
				instructor.setStats(-10, 20, -10); // Energy, Happiness, Money
				}
				else
					System.out.println("Not enough money");
				break;
				
			case 5:
				if (Person.getMoney() >= 30)
				{
				System.out.println("OMG! It's karaoke night at the Hong Kong!\n"
						+ "Someone is singing Sweet Caroline, the crowd goes wild and you join in!\n");
				instructor.setStats(-20, 30, -30); // Energy, Happiness, Money
				}
				else
					System.out.println("Not enough money");
				break;
				
			case 6:
				System.out.println("Be boring and head back to the hotel\n");
				break;
				
			default:
				System.out.println("Invalid Entry, try again Chowdah Head! =P\n");
			}
			}
			while(choice != 6);
			
			System.out.println("Back at the hotel, you turn on the TV and a Boston themed movie marathon is showing.\n"
					+ "Do you want to watch? y/n");
			
			// Eats next line the console.nextInt method does not read the newline character in your input created by hitting "Enter"
			console.nextLine(); 
			
			// Changes answer to lower case for easy comparison.
			String answer = console.nextLine().toLowerCase();
			
			if (answer.equals("y"))
			{
				System.out.println("\nYou stay up late and watch The Depahted, Good Will Hunting and Black Mass.\n");
				instructor.setStats(-100, 0, 0); // Energy, Happiness, Money
			}
			else
				System.out.println("\nYou go to bed\n");
			
			System.out.println("\nThe Following day...");
			
			
			if (Person.getEnergy() < OPTIMAL) // Late for work, spent too much energy
			{
				System.out.println("You spent too much energy yesterday and woke up late for work!");
				mood(Person.getHappiness()); // Determines mood
				System.out.println("Happiness :" + Person.getHappiness());
				System.out.println("Energy    :" + Person.getEnergy());
				System.out.println("Money     :" + Person.getMoney());
				
			}
			else
			{
				System.out.println("You woke up on time for work!");
				mood(Person.getHappiness());// Determines mood
				System.out.println("Happiness :" + Person.getHappiness());
				System.out.println("Energy    :" + Person.getEnergy());
				System.out.println("Money     :" + Person.getMoney());
			}
			
			System.out.println("\n(\\_/)");
			System.out.println("(^_^).o(Thanks for playing)");
			System.out.println("(\")_(\")o");
		}
}