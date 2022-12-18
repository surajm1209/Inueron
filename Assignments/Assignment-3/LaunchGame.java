import java.util.*;

import javax.print.attribute.standard.PageRanges;

class Guesser
{
	int guessNum;
	Guesser()
	{
		Random rand = new Random();
		guessNum = rand.nextInt(10);
	}	
}

class Player
{
	int guessNum;
	Boolean isGuessed = false;
	Player()
	{
		Random rand = new Random();
		guessNum = rand.nextInt(10);
		
	}
}

class Umpire
{
	Guesser guesser = new Guesser();
	Player []players;
	
	Umpire()
	{
		int numberOfPlayers;
		do{
			System.out.println("Enter the number of players (Max 5 Players):");
			Scanner sc = new Scanner(System.in);
			numberOfPlayers = sc.nextInt();
			if(numberOfPlayers > 0 && numberOfPlayers <= 5)
			{	
				players = new Player[numberOfPlayers];
				for (int i=0 ; i<players.length;i++ )
				{
					players[i] = new Player();
				}
				break;
			}
			else
				System.out.println("Wrong Input");
		}while(true);
	}

	void compare()
	{
		Boolean AllCorrect = true;
		Boolean AllWrong = true;
		for(Player p : players)
		{
			if(guesser.guessNum == p.guessNum)
			{
				p.isGuessed =true;
				AllWrong = false;
			}
			else
				AllCorrect = false;
		}
		if(AllCorrect)
			System.out.println("All players have guessed the correct number");
		else if(AllWrong)
			System.out.println("All players have guessed the wrong number");
		else
		{
			for (int i=0 ; i<players.length;i++ )
			{
				if(players[i].isGuessed)
					System.out.println("Player :"+(i+1)+" have guessed the Correct number");					
			}
		}		
		
	}
	
}

public class LaunchGame 
{
	public static void main(String[] args) 
	{
		
		Umpire u=new Umpire();
		u.compare();
	}

}
