import java.util.LinkedList;
public class ScrabbleTest {
    public static void main(String[] args){
        Singleton newInstance = Singleton.getInstance();
        System.out.println("Instance 1 ID: "+System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerOneTiles = newInstance.getTitles(7);
        System.out.println("Player 1: "+playerOneTiles);
        System.out.println(newInstance.getLetterList());
        Singleton InstanceTwo = Singleton.getInstance();
        System.out.println("Instance 2 ID: "+System.identityHashCode(newInstance));
        System.out.println(newInstance.getLetterList());
        LinkedList<String> playerTwoTiles = newInstance.getTitles(7);
        System.out.println("Player 2: "+playerTwoTiles);
    }
}
