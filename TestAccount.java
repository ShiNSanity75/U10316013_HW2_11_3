/**
 * ID:U10316013
 * NAME:HSIAO,TZU-CHI
 * EX:11.3
 */
import java.util.Date;

public class TestAccount {
	//main method
	public static void main(String[] args) {
		Account account = new Account(1206, 20000, 0.045);
		Account savingAccount = new SavingAccount(1023, 20000, 0.045);
		Account CheckingAccount = new CheckingAccount(1895, 20000, 0.045);
		
		//display the result
		System.out.println("account\n" + account.toString() + "\n");
		System.out.println("savingAccount\n" + savingAccount.toString() + "\n");
		System.out.println("CheckingAccount\n" + CheckingAccount.toString() + "\n");
	}
}
