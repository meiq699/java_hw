package myjava.homework_part1;
import java.util.Scanner;


public class Controller {
    public static void main(String[] args) {
        int count = 1;
        StudentInformation[] st = new StudentInformation[20];

        Scanner scanner = new Scanner(System.in);
        String name;
        String id;
        String score;
        int pass = 0;
        int fail = 0;
        int temp;
        int num;
        String option;
        int choice=4;
        while (true) {
            System.out.println("Type1:add a student's data (student ID,student name and score)");
            System.out.println("Type2:show a student's data.");
            System.out.println("Type3:show all studnets' data.");
            option = scanner.next();
            try {
                choice = Integer.parseInt(option);
                temp = 1;
            } catch (NumberFormatException e) {
                System.out.println("Please enter 1~~~3.");
                temp=0;
            }
            if (temp == 1) {
                if (choice > 3 || choice < 1) {
                    System.out.println("Please enter 1~3.");
                }
                st[count] = new StudentInformation();
                if (choice == 1) {
                    System.out.println("Add a student's data:");
                    System.out.println("student's id:");
                    id = scanner.next();
                    System.out.println("student's name:");
                    name = scanner.next();
                    System.out.println("student's score:");
                    score = scanner.next();
                    try {
                        if (Integer.parseInt(score) >= 0 && Integer.parseInt(score) <= 100) {
                            st[count].setData(id, name, Integer.parseInt(score));
                            System.out.println("This is student  " + count);
                            count++;
                            if (Integer.parseInt(score) >= 60) {
                                pass++;
                            } else {
                                fail++;
                            }
                        } else {
                            System.out.println("Please enter 0~100");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter 0~100");
                    }


                }
                if (choice == 2) {
                    System.out.println("To show which student's information");
                    num = scanner.nextInt();
                    if (num > count || num < 1) {
                        System.out.println("Data no found.");
                    } else {

                        System.out.println("Student's ID:" + st[num].getID());
                        System.out.println("Student's name:" + st[num].getName());
                        System.out.println("Score:" + st[num].getScore());
                        System.out.println("This is student " + num);
                    }
                }

                if (choice == 3) {
                    System.out.println("=====Student's data======");
                    for (int i = 1; i < count; i++) {
                        st[i].show_data();
                    }
                    System.out.println("=====================");
                    System.out.println("Pass:" + pass);
                    System.out.println("No pass:" + fail);
                    break;
                }
            }



        }
    }
}