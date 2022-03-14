package day2;
//for enum demonstration
/* public enum Loantype {
HOUSING,AGRICULTURE,EDUCATION;
}*/
public enum Loantype{
	HOUSING(1000){
		public String printval() {
			return "hi there ,its a housing loan application";
		}
	},AGRICULTURE(1000){
public String printval() {
	return "hi there ,its a agriculture loan application";
		}
	},EDUCATION(1000){
public String printval() {
	return "hi there ,its a education loan application";
		}
	};
	int numberOfDispersals;
 Loantype(int i)
	{
	this.numberOfDispersals=i;
	}
	public int getNumberOfDispersals() {
	return numberOfDispersals;
}
public void setNumberOfDispersals(int numberOfDispersals) {
	this.numberOfDispersals = numberOfDispersals;
}
public String display() {
	String msg =  "You have applied for "+this+"Loantype";
	return msg;
}
	public abstract String printval(); 
		
}
