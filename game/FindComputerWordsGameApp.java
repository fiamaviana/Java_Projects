import java.util.Scanner;
public class FindComputerWordsGameApp{
	public static void main(String args[]){
		//declares variables
		String randomString, word, firstPlayer, secondPlayer;
		double firstPlayerTotal,secondPlayerTotal;
		int player = 0;
		int number = 0;
		int round = 0;

		//creates constructor
		FindComputerWordsGame app = new FindComputerWordsGame();
		Scanner sc = new Scanner(System.in);

		//prints the rules of this game
		System.out.println("                                             F-I-N-D-C-O-M-P-U-T-E-R-W-O-R-D-S-G-A-M-E");
		System.out.println("This a turn-base game, please see below the rules: ");
		System.out.println("1. Before starting this game you can choose how many rounds do you want to play;");
		System.out.println("2. 12 letters will be randomly displayed so that you can make a computer word;");
		System.out.println("3. You should make a word using as many of the 12 letters as you can but using each letter only once;");
		System.out.println("4. If a randomly selected letter has multiple occurrences you can use that letter as many times as occurrences the letter has;");
		System.out.println("5. Your word must be a valid computer-related word and you will get points according to the length of the word;");
		System.out.println("6. If your word has more than five letters you will get 1 point for each letter, otherwise, you will get 0.75 points per letter;");
		System.out.println("7. If you enter the same word that another player has already entered you will have the chance to enter another word;");
		System.out.println("                                             F-I-N-D-C-O-M-P-U-T-E-R-W-O-R-D-S-G-A-M-E");
		System.out.println("                                                              S-T-A-R-T");
		System.out.println();

		//asks players how many rounds they want to play
		System.out.println("How many rounds do you want to play? ");
		round = sc.nextInt();

		//a loop that will occur until reach the number of rounds estabilished by players
		while(number < round){
			System.out.println();
			System.out.println("ROUND " + (number +1));
			System.out.println();
			player = 0;
			app.setPlayer(player); //sets the player number to the instatiable class
			firstPlayer = "";
			System.out.println("Please  make a word using as many letters as you can: ");
			app.randomString();// executes the random function in the instatiable class
			randomString = app.getRandomString(); //get the String result of the random function from the instatiable class
			System.out.println(randomString);

			//a loop that will end after the second player has entered his word
			while(player <= 1){
				System.out.println("Player "+ (player + 1) +" please enter a word: ");
				word = sc.next().toLowerCase(); //receives the word from the player
				app.setWord(word);
				//checks wheter the player is the first or second
				if(player == 0){
					firstPlayer = word; // the first player receives the word
					app.StringValidation(); //calls the string validation function in the instatiable class
					player++;
					app.setPlayer(player); //sets the player number
				}
				else{
					secondPlayer = word;//the second player receives the word
					if(firstPlayer.equals(secondPlayer)){//check whether the second player has entered the same word as the first player
						System.out.println("This word was already taken please choose another using these letters.");
						System.out.println(randomString);
					}
					else{
						player++;
						app.setPlayer(player); //sets the player number
						app.StringValidation();//calls the string validation function in the instatiable class

					}

				}

			}
			number++; //increases the number to check later if the number of rounds was reached
		}

		firstPlayerTotal = app.getFirstPlayerTotal(); //gets the total score of the first player
		secondPlayerTotal = app.getSecondPlayerTotal();//gets the total score of the second player
		if(firstPlayerTotal > secondPlayerTotal){//checks who the winner is and display their points
			System.out.println("Congratulations Player 1! You won with : " + firstPlayerTotal + " points! Player 2 got " + secondPlayerTotal + " points.");
		}
		else if(secondPlayerTotal > firstPlayerTotal){
			System.out.println();
			System.out.println("Congratulations Player 2! You won with : " + secondPlayerTotal + " points! Player 1 got " + firstPlayerTotal + " points.");
		}
		else{
			System.out.println();
			System.out.println("Draw! Player 1 got : " + secondPlayerTotal + " points. Player 2 got " + firstPlayerTotal + " points.");
		}
	}
}