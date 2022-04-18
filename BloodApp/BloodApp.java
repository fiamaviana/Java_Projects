import java.util.Scanner;

public class BloodApp{
	public static void main(String args[]){
		int age;
		String type, status, message;

		Scanner sc = new Scanner(System.in);
		Blood app = new Blood();

		System.out.println("Please enter your age: ");
		age = sc.nextInt();
		if (age < 18){
			System.out.println("Sorry you can't donate yet.");
		}

		else{

			System.out.println("Please enter your blood type(A, AB, B, O): ");
			type = sc.next();
			app.setType(type);

			System.out.println("Enter status: (D/R): ");
			status = sc.next();
			app.setStatus(status);

			app.bloodInfo();

			message = app.getMessage();
			if(status.equals("D")){
				System.out.println("You can donate for these types of blood: " + message);
			}
			else{
				System.out.println("You can receive these types of blood: " + message);
			}
		}
	}

}