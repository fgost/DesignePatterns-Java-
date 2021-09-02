public class AnimalPlay {
    public static void main(String[] args){
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());
    }
}
/*
o padrão de estratégia permite que o algoritmo varie independentemente dos clientes que o usam

                                                Quando usar?

quando você deseja definir uma classe que terá um comportamento semelhante a outros comportamentos em uma lista

quando você precisa usar um dos vários comportamentos dinamicamente

muitas vezes reduz a longa lista de condicionais

evita códigos duplicados

impede as mudanças de classe de forçar outras mudanças de classe

                                                ponto negativo:

aumento do número de objetos / classes

  */