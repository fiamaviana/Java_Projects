public class Blood{
	private String type, status, message;

	//constructors
	public Blood(){
	}

	public Blood(String type, String status){
		this.type = type;
		this.status = status;
	}

	//setters
	public void setType(String type){
		this.type = type;
	}

	public void setStatus(String status){
		this.status = status;
	}
	//other methods
	public void bloodInfo(){
		if(type.equals("AB")){
			if(status.equals("D")){
				message = "D to: AB";
			}
			else{
				message= "R from: AB, A, B, O";
			}

		}else if(type.equals("A")){
			if(status.equals("D")){
				message = "D to: A, AB";
			}
			else{
				message= "R from: A, O";
			}

		}else if(type.equals("B")){
			if(status.equals("D")){
				message = "D to: B, AB";
			}
			else{
				message= "R from: B,O";
			}

		}else if(type.equals("O")){
			if(status.equals("D")){
				message = "D to: AB,A,B,O";
			}
			else{
				message= "R from: O";
			}

		}else{
			message="You must be a vampire!";
		}
	}

	//getters
	public String getMessage(){
		return message;
	}
}