package myjava.homework;

// Represents a withdrawal ATM transaction

public class Withdrawal extends Transaction {

    int money;
	/* Fill your code here */
    public Withdrawal(int a,Screen b,BankDatabase c,Keypad d){
        super(a,b,c,d);
        new Screen().displayMessageLine("How much do you want to withdrawl:");
       money=new Keypad().getGetInput();
        if(money==-1){
            new Screen().displayMessageLine("Wrong input");
            money=0;
        }
        else if(money>getBankDataBase().getTotalBalance(getAccountNumber())){
            new Screen().displayMessageLine("Sorry,you can not withdrawal money.");
            money=0;
        }
        else
            new Screen().displayMessageLine("Transation Success.");
    }

    @Override
    public void execute() {

        getBankDataBase().setTotalBalance(getAccountNumber(),-money);

    }
}
