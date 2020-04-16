package myjava.homework.part2;
import java.util.Scanner;


public class BigOrSmall {

    public static void main(String[] args) {
        String choose;
        RaceKind RaceKind = new RaceKind();
        Scanner scanner = new Scanner(System.in);
        int x=0;

        while (x!=1) {
            System.out.println("Which game do you want? (You can input big or small to play,or input exit to quit)");
            choose = scanner.nextLine();
            switch (choose) {
                case "big":
                  new Race(RaceKind.BIG);

                    break;
                case "small":
                    new Race(RaceKind.SMALL);

                    break;
                case "exit":
                    System.out.println("GAME OVER!!!");
                    x=1;
                    break;
                default:
                    System.out.println("You have a error input.The game is failed!");
                    break;
            }
        }
    }
}
