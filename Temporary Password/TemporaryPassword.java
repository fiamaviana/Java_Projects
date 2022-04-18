/**
TemporaryPassword
Author: Fiama Viana
Date: 02.12.2020
**/
public class TemporaryPassword{
	//declare variables
	private String name, password;
	private StringBuffer strBuff;
	private int count;

	//contructor
	public TemporaryPassword(){
		name = " ";
		password = " ";
		strBuff = new StringBuffer();
		count = 0;
	}

	//set method
	public void setName(String name){
		this.name = name;
	}


	//the compute method will generate the first password
	public void firstPassword(){
		for(int i = 0; i < name.length(); i++){
			if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i'|| name.charAt(i) == 'o'|| name.charAt(i) == 'u'){
				char vowel = Character.toUpperCase(name.charAt(i));
				strBuff.append(vowel);
				count++;
			}
			else if(name.charAt(i) == ' '){
				strBuff.append('&');
				count++;
			}
			else{
				strBuff.append(name.charAt(i));
				count++;
			}

		}
		strBuff.append(count);
		strBuff.append('%');
		strBuff.append(name.charAt(1));
		password = strBuff.toString();
	}

	//get
	public String getPassword(){
		return password;
	}

}