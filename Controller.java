package myjava.homework_part2;
import java.util.Scanner;
public class Controller {
    public static void main(String[] args) {
        int choose = 4;
        int temp;
        String option;
        String name;
        Scanner scanner = new Scanner(System.in);
        ItemList it = new ItemList();
        while (true) {
            System.out.println("Type1:Add item to list.");
            System.out.println("Type2:remove item to list.");
            System.out.println("Type3:show the list.");
            option = scanner.next();
            try {
                choose= Integer.parseInt(option);
                temp = 1;
            } catch (NumberFormatException e) {
                System.out.println("Please enter 1~3.");
                temp=0;
            }
            if(temp==1){
            if (choose > 3 || choose < 1) {
                System.out.println("Please enter 1~3.");
            }
            if (choose == 1) {
                System.out.println("Add the item name:");
                name = scanner.next();
                it.addItem(name);
            }
            if(choose==2){
                System.out.println("remove  item name:");
                name = scanner.next();
                it.remove(name);
            }
            if(choose==3){
                it.printList();
                break;
        }
    }
}}}
