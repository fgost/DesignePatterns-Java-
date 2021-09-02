public class Animal {
    private String name;
    private int weight;
    private String sound;

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
}
