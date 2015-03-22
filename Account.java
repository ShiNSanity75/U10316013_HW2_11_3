import java.util.Date;

public class Account {
	protected int id; //ID for the account
	protected double balance; //Balance for the account
	protected double annualInterestRate; //Store the current interest rate
	java.util.Date dateCreated = new java.util.Date(); //stores the date when the account was created
	
	//no-arg constructor
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	//constructor with the specified id , initial balance and newAnnualInterestRate
	public Account(int newID, double newBalance,double newAnnualInterestRate) {
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
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
	public void setBalance(double newBalance) {
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
		return balance * getMonthlyInterestRate();
	}
	
	//withdraw a specified amount from the account
	double withdraw(double amount) {
			return balance -= amount;
	}
	
	//deposit a specified amount to the account
	double deposit(double amount) {
		return balance += amount;
	}
	
	// Create toString method
	public String toString(){
		 return "ID: " + getID() + "\n" + "Balance1: " + withdraw(2500) + "\n" +
			"Balance2: " + deposit(3000) + "\n" + "Monthly Interest: " + getMonthlyInterest() +
			"\nDate:" + getDateCreated();
	}
}
