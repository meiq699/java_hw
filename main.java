package myjava.homework;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Combination combination=new Combination();
    Permutation permutation=new Permutation();
    int y=0;
    String choose;
    while(y!=1){
        System.out.println("Choose your four star game type：(1):Combination (2) Permutation (3)Exit");
        choose = scanner.nextLine();

        switch (choose){
            case"1":
             combination.checkOfWin();
                break;
            case"2":
               permutation.checkOfWin();
                break;
            case "3":
                y=1;
                break;
            default:
                System.out.println("You have a error input");
                break;
        }
    }
}
}
