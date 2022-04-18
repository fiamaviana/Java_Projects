/**
InsuranceApp
Author: Fiama Viana
Date: 01.12.2020
**/
import java.util.Scanner;
public class InsuranceApp{
	public static void main(String args[]){
		//declare variables
		int age,number;
		double cost,price;

		//create objects
		Scanner sc = new Scanner(System.in);
		Insurance app = new Insurance();


		//input and setters method to store and send the input to the instantiable class
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		app.setAge(age);

		System.out.println("Enter the number of non-claims bonus year: ");
		number = sc.nextInt();
		app.setNumber(number);

		System.out.println("Enter the car's price: ");
		price = sc.nextInt();
		app.setPrice(price);

		// process the compute method to calculate the car's insurance
		app.compute();

		//get the cost from instantiable class and output
		cost = app.getCost();
		System.out.println("The price of the car's insurance is " + cost);

	}
}