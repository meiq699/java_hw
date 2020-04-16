package myjava.homework;


public class Permutation {
    public void checkOfWin(){
        fourStarGame game=new fourStarGame();
        if(game.getUserNums().size()==game.getWinNums().size()){
        if(game.getUserNums().equals(game.getWinNums())){
            System.out.println("**You win!!!");
        }
        else{
            System.out.println("**You lost!!!");
    }
}


    }}
