import java.util.Date;

public class CheckingAccount extends Account {
	public CheckingAccount() {
	}
	
	//constructor with the specified id , initial balance and newAnnualInterestRate
	public CheckingAccount(int newID, double newBalance,double newAnnualInterestRate) {
		super(newID,newBalance,newAnnualInterestRate);
	}
}
