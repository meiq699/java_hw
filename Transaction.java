package myjava.homework;

// Abstract superclass Transaction represents an ATM transaction

public abstract class Transaction {
	
	/* Fill your code here */
	private Screen screen;
	protected BankDatabase bank;
	protected Keypad key;
	private int accountNumber;
	public int getAccountNumber(){
		return this.accountNumber;
    }
	public Transaction(int a,Screen b,BankDatabase c){
		this.accountNumber=a;
		this.screen=b;
		this.bank=c;
	}

	public Transaction(int a,Screen b,BankDatabase c,Keypad d){
		this.accountNumber=a;
		this.screen=b;
		this.bank=c;
		this.key=d;

	}


	protected BankDatabase getBankDataBase(){
		return this.bank;
	}

    public abstract void execute();


}
