package myjava.homework;
// Represents a deposit ATM transaction

public class Deposit extends Transaction {
	int money=0;
	/* Fill your code here */
    public Deposit(int a,Screen b,BankDatabase c,Keypad d){
        super(a,b,c,d);
        new Screen().displayMessageLine("How much do you want to deposit:");
      money=new Keypad().getGetInput();
        if(money==-1){
            new Screen().displayMessageLine("Wrong input");
            money=0;
        }
        else
            new Screen().displayMessageLine("Transation Success.");


    }
    public void execute() {

        getBankDataBase().setTotalBalance(getAccountNumber(),money);

    }
}
