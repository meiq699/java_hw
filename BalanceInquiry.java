package myjava.homework;
// Represents a balance inquiry ATM transaction

public class  BalanceInquiry extends Transaction{

	/* Fill your code here */
	public BalanceInquiry(int a,Screen b,BankDatabase c){
		super(a,b,c);
	}
	public void execute(){
		getAccountNumber();
        new Screen().displayMessageLine("Balance Information:");
		new Screen().displayMessageLine("Total balance:"+this.bank.getTotalBalance(getAccountNumber()));

    }

}
