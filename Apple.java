package myjava.homework.part1;

public class Apple {
    private String variety;
    private int price;
    private double weight;

    public Apple(int price,double weight){
        setPrice(price);
        setWeight(weight);
    }
    public Apple(String variety,int price,double weight){
          setPrice(price);
          setWeight(weight);
          setVariety(variety);
    }

    public int getPrice() {
        return this.price;
    }
    protected  void setPrice(int price){
        this.price=price;
    }
    public double getWeight() {
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    protected void setVariety(String variety){
        this.variety=variety;
    }


}
