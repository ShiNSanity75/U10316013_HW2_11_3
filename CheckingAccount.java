/**
 * ID:U10316013
 * NAME:HSIAO,TZU-CHI
 * EX:11.3
 */
import java.util.Date;

public class CheckingAccount extends Account {
	public CheckingAccount() {
	}
	
	//constructor with the specified id , initial balance and newAnnualInterestRate
	public CheckingAccount(int newID, double newBalance,double newAnnualInterestRate) {
		super(newID,newBalance,newAnnualInterestRate);
	}
	
	double overdraftLimit = -10000;
	
	@Override
	double withdraw(double amount) {
		//if overdraft limit return 0
		if(balance - amount < overdraftLimit) {
			return 0;
		}else {
			return balance -= amount;
		}
	}
	
	// Create toString method
	@Override
	public String toString(){
		return "ID: " + getID() + "\nBalance: " + withdraw(35000) + "\nDate:" + getDateCreated();
	}
}
