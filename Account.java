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
	
	//get method for id
	public int getID() {
		return id;
	}
	
	//set method for id
	public void setId(int newId) {
		id = newId;
	}
	
	//get method for balance
	public double getBalance() {
		return balance;
	}
	
	//set method for balance
	public void setBalance(double newBalanced) {
		balance = newBalance;
	}
	
	//get method for annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	//set method for annualInterestRate
	public void setAnnualInterestRate(double newAnnualInterestRat) {
		annualInterestRate = newAnnualInterestRat;
	}
	
	//get method for dateCreated
	public Date getDateCreated() {
		 return dateCreated;
	}
	
	//return the monthly interest rate
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	//return monthly interest
	double getMonthlyInterest() {
		return balance * monthlyInterestRate;
	}
	
	//withdraw a specified amount from the account
	double withdraw(double amount) {
		return balance -= amount;
	}
	
	//deposit a specified amount to the account
	double deposit(double amount) {
		return balance += amount;
	}
}
