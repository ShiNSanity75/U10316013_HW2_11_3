import java.util.Date;

pubilc class Account {
	private int id; //ID for the account
	private double balance; //Balance for the account
	private double annualInterestRate; //Store the current interest rate
	private Date dateCreated; //stores the date when the account was created
	
	//no-arg constructor
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	//constructor with the specified id and initial balance
	public Account(int newID, double newBalance) {
		id = newID;
		balance = newBalance;
	}
}
