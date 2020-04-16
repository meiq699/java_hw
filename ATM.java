package myjava.homework;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import java.io.IOException;


import java.util.Scanner;

public class ATM {
    Scanner scan=new Scanner(System.in);
	/* Fill your code here */
    BankDatabase bank=new BankDatabase();
    Screen screen=new Screen();
    Keypad key=new Keypad();

    public void run() throws IOException{
        while (true){
            int account;
            int pin;
            int choose;
            int temp=0;
            new Screen().displayMessageLine("Wellcome!");
            new Screen().displayMessageLine("Please enter your account number:");
            account=key.getGetInput();
            new Screen().displayMessageLine("Please enter your pin:");
            pin=key.getGetInput();
                if(!bank.authenticateUser(account, pin)){    //錯誤帳密
                    new Screen().displayMessageLine("Account or Pin error.");
                }
                else{
                    while (temp!=1){
                        new Screen().displayMessageLine("\nMain_menu:");
                        new Screen().displayMessageLine("1.View my balance");
                        new Screen().displayMessageLine("2.Withdraw");
                        new Screen().displayMessageLine("3.Deposit");
                        new Screen().displayMessageLine("4.Loan");
                        new Screen().displayMessageLine("5.Exit");
                        new Screen().displayMessage("Enter a choice:");
                        choose=key.getGetInput();
                        switch (choose){

                            case 1:
                                Transaction transaction=new BalanceInquiry(account,screen,bank);
                                transaction.execute();
                                break;
                            case 2:
                                Withdrawal withdrawal= new Withdrawal(account,screen,bank,key);
                                withdrawal.execute();
                                break;
                            case 3:
                               Deposit deposit=new Deposit(account,screen,bank,key);
                               deposit.execute();
                                break;
                            case 4:
                                Loan loan=new Loan(account,screen,bank,key);
                                loan.execute();
                                 break;
                            case 5:
                                System.out.println("BYE!");
                                temp=1;
                                break;
                            default:
                                System.out.println("Wrong input");
                                break;
                        }
                    }

            }


        }
    }

	
}
