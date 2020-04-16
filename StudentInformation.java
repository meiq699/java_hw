package myjava.homework_part1;

public class StudentInformation {
    private String id;
    private String name;
    private int score;
    String grade;

    public StudentInformation(){
        id="";
        name="";
        score=0;
    }

    public StudentInformation(String id, String name,int score){
        this.id=id;
        this.name=name;
        this.score=score;

    }
    public void setID(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        this.score=score;

    }
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public void setData(String id,String name ,int score){
        setID(id);
        setName(name);
        setScore(score);

    }
    public void show_data(){

        System.out.println("Student's ID:" +getID());
        System.out.println("Student's name:" +getName());
        if(getScore()>=60){
            grade="pass";
        }
        else{
            grade="fail";
        }
        System.out.println("Student  "+getName()+" "+grade+" this project\n\n");
    }



}
