public class Animal {
    private String name;
    private int weight;
    private String sound;
    private String favFood;
    private double speed;

    public Flys flyingType;

    public String getName() {return name;}

    public void setName(String newName) {
        this.name = newName;
    }

    public int getWeight() {return weight;}

    public void setWeight(int newWeight) {
        if(newWeight > 0){
            this.weight = newWeight;
        }else{
            System.out.println("Weight must be bigger than 0");
        }
    }

    public String getSound() {return sound;}

    public void setSound(String newSound) {
        this.sound = newSound;
    }

    public void setFavFood(String newFavFood){favFood = newFavFood;}
    public String getFavFood(){return favFood;}

    public void setSpeed(double newSpeed){speed = newSpeed;}
    public double getSpeed(){return  speed;}

    public String tryToFly(){
        return flyingType.fly();
    }
    public void setFlyingAbility(Flys newFlyType){
        flyingType = newFlyType;
    }

}
