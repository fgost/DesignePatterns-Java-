import java.util.Scanner;
public class EnemyShipTesting {
    public static void main(String[] args){
        EnemyShipFactory  shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of ship? (U/R/B)");
        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        if(theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else
            System.out.println("Enter a U R or B next time");
    }
    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
/*
				Factory Pattern
	O Factory Pattern permite que você crie objetos sem especificar a classe exata de objeto que será criada.
	Quando um método retorna uma das várias classes possíveis que compartilham uma superclasse comum

				Quando Usar?

	-Quando você não sabe com antecedência de qual objeto de classe você precisa

	-Quando todas as classes potenciais estão na mesma hierarquia de subclasse

	-Para centralizar o código de seleção de classe

	-Quando você não quer que o usuário conheça todas as subclasses

	-Para encapsular a criação de objetos

 */
