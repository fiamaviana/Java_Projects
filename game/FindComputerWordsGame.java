import java.util.Arrays;
import java.util.List;

public class FindComputerWordsGame{
	//declare variables
	private String word, randomString,firstPlayer,secondPlayer;
	private int player;
	private double firstPlayerTotal, secondPlayerTotal;
	String alphabetic = "abcdefghijklmnopqrstuvwxyz";
	private String[] validWords = {"algorithm", "application", "backup", "bit", "buffer", "bandwidth", "broadband", "bug", "binary", "browser", "bus",
	"cache", "command", "computer", "cookie", "compiler", "cyberspace", "compress", "configure", "database",
	"digital", "data", "debug", "desktop", "disk", "domain", "decompress", "development", "download", "dynamic",
	"email", "encryption", "firewall", "flowchart", "file", "folder", "graphics", "hyperlink", "host", "hardware", "icon",
	"inbox", "internet", "kernel", "keyword", "keyboard", "laptop", "login", "logic", "malware", "motherboard", "mouse",
	"mainframe", "memory", "monitor", "multimedia", "network", "node", "offline", "online", "path", "process",
	"protocol", "password", "phishing", "platform", "program", "portal", "privacy", "programmer", "queue",
	"resolution", "root", "restore", "router", "reboot", "runtime", "screen", "security", "shell", "snapshot", "spam",
	"screenshot", "server", "script", "software", "spreadsheet", "storage", "syntax", "table", "template", "thread",
	"terminal", "username", "virtual", "virus", "web", "website", "window", "wireless"};
	List<String> list = Arrays.asList(validWords); //creates a list of array for valid words

	//setters
	public void setWord(String word){
		this.word = word;
	}

	public void setFirstPlayer(String firstPlayer){
		this.firstPlayer = firstPlayer;
	}

	public void setSecondPlayer(String secondPlayer){
		this.secondPlayer = secondPlayer;
	}

	public void setPlayer(int player){
		this.player = player;
	}

	//getters
	public String getRandomString(){
		return randomString;
	}
	public double getFirstPlayerTotal(){
		return firstPlayerTotal;
	}

	public double getSecondPlayerTotal(){
		return secondPlayerTotal;
	}

	//random function to display 12 letters
	public void randomString(){
		StringBuilder randomletters = new StringBuilder(); //string builder to receive each letter generated from the loop
		for(int i=0; i<12;i++){//a loop to generate each letter until it reaches the 12th letter
			int letter = (int)(alphabetic.length()*Math.random()); //a math random function was used to generate letters randomly
			randomletters.append(alphabetic.charAt(letter)); //string builder receives the letter
		}
		randomString = randomletters.toString(); //string builder is converted to String
	}
	//a function that will do the validation and check the points simultaneously
	public void StringValidation(){
		double points,total = 0;
		char last = word.charAt(word.length()-1); //a char to find the last character in a word
		StringBuilder sb = new StringBuilder(randomString);//a string builder to receive the random String
		for(int i = 0; i < word.length(); i++){//this loop will check each character in the word entered by the player
			char ch1 = word.charAt(i);//ch1 receives the character to be analysed
			if(sb.indexOf(word.valueOf(word.charAt(i))) == -1){//indexOf function will check if this letter is not in the random String that is allocated in the string builder
				System.out.println(ch1 + " - This letter was not found. You have to make a computer word using only those letters displayed on the screen.");
				System.out.println("Remember that you can only use that letter as many times as occurrences the letter has.");
				System.out.println("You got no points in this round. Try again next time.");
				break;//it will break the loop here in case a letter entered by the player was not found in the letters given by the random String and the player will not gain any point
			}
			else{//in case all letters entered by the player was found in the random string
				for(int j=0; j < sb.length(); j++){//this loop will check which letters was used from the random String
					char ch2 = sb.charAt(j); //ch2 receives a letter from the String Builder where is allocated the random String to be analysed
					if(ch1 == ch2){ //if a letter entered by the player is the same character in the String Builder
						sb = sb.delete(j,j+1); //this character will be deleted from the String Builder, so that he will not be able to use the same letters more than one time
						break;

					}
				}
				if(ch1 == last){ //this will check if this is the last character to be analysed
					if(list.contains(word)){//checks if the word entered by the player is contained in the list array
						System.out.println(word + " - this is a valid computer-related word.");
						if(word.length() <= 5){//if the word contains less or 5 characters
							points = word.length() * 0.75; // the points will be the amount of characters times 0.75
							System.out.println("You got "+points+" points in this round");
							if(player == 0){//checks which player receives the points
								firstPlayerTotal += points;
								System.out.println("Total Score: "+ firstPlayerTotal);
							}
							else{
								secondPlayerTotal += points;
								System.out.println("Total Score: "+ secondPlayerTotal);
							}

						}
						else{//if the word is longer than 5 characters
							points = word.length();//the points will be the same amount of characters
							System.out.println("You got "+points +" points in this round");

							if(player == 0){//checks which player receives the points
								firstPlayerTotal += points;
								System.out.println("Total Score: "+ firstPlayerTotal);
							}
							else{
								secondPlayerTotal += points;
								System.out.println("Total Score: "+ secondPlayerTotal);
							}
						}
					}
					else{//in case of the word entered by the player was not found in the array
						System.out.println(word + " - is not a valid computer-related word, you did not win any points in this round.");
					}

				}

			}

		}

	}

}