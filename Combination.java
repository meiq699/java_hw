package myjava.homework;

import java.util.ArrayList;

public class Combination {
    public void checkOfWin() {
        fourStarGame game = new fourStarGame();
        int flag = 0;
        ArrayList<Integer> user = game.getUserNums();
        ArrayList<Integer> win = game.getWinNums();
        if (user.size() == win.size()) {
            for (int i =0; i < user.size(); i++) {
                for (int j =0; j < win.size(); j++) {
                    if (user.get(i).equals(win.get(j))) {
                        flag++;
                    }
                    else
                        continue;

                }
            }
            if (flag == win.size()) {
                System.out.println("***You win!!!");
            } else {
                System.out.println("***You lost!!!");
            }
        }
    }
}