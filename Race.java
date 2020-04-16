package myjava.homework.part2;


public class Race {
    int playerIndex=0;
    int comIndex=0;
    int choose=3;

    public Race(int a){

        if(a==RaceKind.BIG){
            choose=1; //比大
        }
        else if(a==RaceKind.SMALL){
            choose=2; //比小
        }
        start();
    }
    public void start(){
        String[] flower={"_club_","_diamond_","_heart_","_spade_"};
        String[] num={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] card=new String[100];;
        int sum=0;
        for(int i=0;i<13;i++){
            for(int j=0;j<4;j++){
                card[sum]=flower[j]+num[i];
                sum++;
            }
        }
        String com=card[(int)(Math.random()*52)];
        String player=card[(int)(Math.random()*52)];

        for(int i=0;i<52;i++){
            if(player==card[i]){
                playerIndex=i;
            }
            if(com==card[i]){
                comIndex=i;
            }
        }
        if(comIndex==playerIndex){  //避免抽到重複的排
            start();
        }
        System.out.println("Your hand is "+player);
        System.out.println("com's hand is "+com);
        if(choose==1){ //比大
            if(playerIndex>comIndex){
                System.out.println(player+" is bigger tham "+com);
                System.out.println("So,you win");
            }
            else {
                System.out.println(com+" is bigger tham "+player);
                System.out.println("So,com win");
            }
        }
        else{
            if(playerIndex<comIndex){
                System.out.println(player+" is smaller tham "+com);
                System.out.println("So,you win");
            }
            else {
                System.out.println(com+" is smaller tham "+player);
                System.out.println("So,com win");
            }
        }

    }


}
