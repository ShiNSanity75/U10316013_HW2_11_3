import java.util.Date;

public class SavingAccount extends Account {
	public SavingAccount() {
	}
	
	//constructor with the specified id , initial balance and newAnnualInterestRate
	public SavingAccount(int newID, double newBalance,double newAnnualInterestRate) {
		super(newID,newBalance,newAnnualInterestRate);
	}
	
	@Override
	double withdraw(double amount) {
		// if overdrawn return 0
		if(amount > balance) {
			return 0;
		}else {
			return balance -= amount;
		}
	}
}
