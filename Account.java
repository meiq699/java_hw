//Represents a bank account
package myjava.homework;
public class Account {
	
	/* Fill your code here */
	private int accountNumber;
    private int pin;
    private int totalBalance;
    private int debt=0;
    private char creditLevel;
    public Account(int x,int y,int z,int t,char w){
        this.accountNumber=x;
        this.pin=y;
        this.totalBalance=z;
        this.debt=t;
        this.creditLevel=w;

    }
    public boolean validatePIN(int x){
        if(x==this.pin){
            return true;
        }
        else
            return false;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public int getTotalBalance() {
        return this.totalBalance;
    }
    public char getCreditLevel(){

        return this.creditLevel;
    }
    public int getDebt(){
        return this.debt;
    }
  public int setTotalBalance(int x){
        this.totalBalance=this.totalBalance+x;
        return this.totalBalance;
    }
    public int setDebt(int x){
        this.debt=this.debt+x;
        return this.debt;
    }




}
