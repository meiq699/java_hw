package myjava.homework;
// Represents the bank account information database

public class BankDatabase {
	private Account[] accounts; // array of Accounts
	public int Account;
	public int Balamce;
    // no-argument BankDatabase constructor initializes accounts
	public BankDatabase () {
		accounts = new Account[4];  // just 4 accounts for testing
		accounts[0] = new Account(111, 222, 5000,0,'A');
		accounts[1] = new Account(222, 333, 4000,0,'B');
		accounts[2] = new Account(333, 444, 3000,0,'C');
		accounts[3] = new Account(444, 555, 2000,0,'D');
	}
	int k=0;
	
	/* Fill your code here */
	public boolean authenticateUser(int x,int y){
		int temp=0;
		for(int i=0;i<=3;i++){
		if(accounts[i].validatePIN(y)){
			if(accounts[i].getAccountNumber()==x){
				this.Account=x;
				k=i;
				temp=1;
				break;
			}
		}
		}
		if(temp==1){
			return true;
		}
		else
			return false;

	}
	public int getTotalBalance(int x){
		int y=0;
		for(int i=0;i<=3;i++){
			if(accounts[i].getAccountNumber()==x){
				y=i;
				break;
			}
		}
		return accounts[y].getTotalBalance();
	}

	public char getCreditLevel(){
		return accounts[k].getCreditLevel();
	}
	public int getDebt(){
		return accounts[k].getDebt();
	}
	public void setTotalBalance(int x,int y){
		int p=0;
		for(int i=0;i<=3;i++){
			if(accounts[i].getAccountNumber()==x){
				p=i;
				break;
			}
		}
		accounts[p].setTotalBalance(y);
	}
	public void setDebt(int x,int y){
		int t=0;
		int money;
		for(int i=0;i<=3;i++){
			if(accounts[i].getAccountNumber()==x){
				t=i;
				break;
			}
		}
		/*if(accounts[t].getCreditLevel()=='A'){
			money=11000;
		}
		else if(accounts[t].getCreditLevel()=='B'){
			money=9000;
		}
		else if(accounts[t].getCreditLevel()=='C'){
			money=7000;
		}
		else
			money=5000;

		if(accounts[t].getDebt()+y>=money){
			accounts[t].setDebt(y);
		}
		else
			new Screen().displayMessageLine("Transaction error!");*/
		accounts[t].setDebt(y);
	}
}
