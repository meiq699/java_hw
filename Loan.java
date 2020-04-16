package myjava.homework;

// Represents a withdrawal ATM transaction


public class Loan extends Transaction{
    int debtmoney;
    int money;
	/* Fill your code here */
    public Loan(int a,Screen b,BankDatabase c,Keypad d){
        super(a, b, c, d);
        if(getBankDataBase().getCreditLevel()=='A'){
            debtmoney=11000;
        }
        else if(getBankDataBase().getCreditLevel()=='B'){
            debtmoney=9000;
        }
        else if(getBankDataBase().getCreditLevel()=='C'){
            debtmoney=7000;
        }
        else
            debtmoney=5000;
        int unusemoney=debtmoney-getBankDataBase().getDebt();
        new Screen().displayMessageLine("Your debt:"+getBankDataBase().getDebt());
        new Screen().displayMessageLine("Your limit is "+unusemoney+", how much do you want to loan:");
        money=new Keypad().getGetInput();

        if(money==-1){
            new Screen().displayMessageLine("Wrong input");
            money=0;
        }
        else if(money>unusemoney){
            new Screen().displayMessageLine("Transation error. You have not much Loan Limit.");
            money=0;
        }
        else
            new Screen().displayMessageLine("Transation Success.");

    }

    @Override
    public void execute() {
        getBankDataBase().setDebt(getAccountNumber(),money);

    }
}
