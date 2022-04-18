/**
TemporaryPasswordApp
Author: Fiama Viana
Date: 02.12.2020
**/
import javax.swing.JOptionPane;
public class TemporaryPasswordApp{
	public static void main(String args[]){
		//variables
		String name, password;

		//create a object
		TemporaryPassword app = new TemporaryPassword();

		//input to get a name and set method to store and send the name to the instatiable class
		name = JOptionPane.showInputDialog(null,"Enter your full name: ");
		app.setName(name);

		//process the compute method to get the first password in the instatiable class
		app.firstPassword();

		//get the temporary password from instatiable class and outputs it
		password = app.getPassword();
		JOptionPane.showMessageDialog(null, "Your temporary password is: " + password);
	}
}