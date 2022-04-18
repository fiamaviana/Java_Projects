/**
Insurance
Author: Fiama Viana
Date: 01.12.2020
**/
public class Insurance{
	//declare variables
	private int age,number;
	private double cost,price;

	//contructors
	public Insurance(){
		age = 0;
		number = 0;
		cost = 0;
		price = 0;
	}

	//set
	public void setAge(int age){
		this.age = age;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public void setPrice(double price){
			this.price = price;
	}
	//compute
	public void compute(){
		if (age <= 27){
			switch(number){
				case 0:
					cost = price * 0.15;
					break;
				case 1:
					cost = price * 0.1;
					break;
				case 2:
					cost = price * 0.1;
					break;
				case 3:
					cost = price * 0.1;
					break;
				default:
					cost = price * 0.08;
			}
		}
		else{
			switch(number){
				case 0:
					cost = price * 0.09;
					break;
				case 1:
					cost = price * 0.7;
					break;
				case 2:
					cost = price * 0.7;
					break;
				case 3:
					cost = price * 0.7;
					break;
				default:
					cost = price * 0.6;
			}
		}

	}

	//get
	public double getCost(){
		return cost;
	}
}