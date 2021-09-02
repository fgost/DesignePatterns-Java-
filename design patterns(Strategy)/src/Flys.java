public interface Flys {
     String fly();

}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "Flying Hight";
    }
}

class CantFly implements Flys{

    @Override
    public String fly() {
        return "I cant Fly";
    }
}
