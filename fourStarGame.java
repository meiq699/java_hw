package myjava.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class fourStarGame {
    private ArrayList<Integer> userNums= new ArrayList<Integer>();
    private ArrayList<Integer> winNums= new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    int userChoose;
    String[] temp;

    public fourStarGame(){
        generateWinNums();
        generateUserNums();
    }
    public void generateUserNums(){
        String user;
        System.out.println("Input four user number");
        user=scanner.nextLine();
        String[] token=user.split(" ");
        int flag=0;
        for(int i=0;i<token.length;i++){
            try{
                int x=Integer.parseInt(token[i]);
            }
            catch (NumberFormatException e){
                System.out.println("Wrong input, try again.");
                flag=1;
                new main();
            }
        }
        if(user.length()!=(winNums.size()+4)){
            System.out.println("Wrong input, try again.");
            flag=1;
            new main(); }

        if(flag!=1){
            for(int i=0;i<winNums.size();i++){
                String temp=token[i];
                int x=Integer.parseInt(temp);
                userNums.add(x);
            }
        }

    }
    public void generateWinNums(){ //取出不重複之數
        int flag=0;
        int num=0;
        int count=1;

        ArrayList<Integer> numbers= new ArrayList<Integer>();
        for (int i=0;i<=9;i++){
            numbers.add(i);
        }
        while (flag!=4){
            int x=(int)(Math.random()*10);
            for(int j=0;j<numbers.size();j++){ //代表此數還沒被其他數拿走
                if(x==numbers.get(j)){
                    winNums.add(x);
                    numbers.remove(j);
                    flag++;
                    break;
                }
            }

        }
        System.out.print("Win numbers :");
        for (int i=0;i<4;i++){
            System.out.print(winNums.get(i)+" ");
        }
        System.out.print("\n");

    }
    public ArrayList<Integer> getUserNums(){
        return this.userNums;

    }
    public ArrayList<Integer> getWinNums(){
        return this.winNums;
    }
}

