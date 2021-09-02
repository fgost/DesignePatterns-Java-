public class GrabStoks {
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(199.00);
        stockGrabber.setAAPLPrice(677.60);
        stockGrabber.setGOOGPrice(689.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(526.00);
        stockGrabber.setAAPLPrice(800.60);
        stockGrabber.setGOOGPrice(500.50);

        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(526.00);
        stockGrabber.setAAPLPrice(800.60);
        stockGrabber.setGOOGPrice(500.50);

        Runnable getIBM = new GetTheStocks(stockGrabber, 2, "IBM", 197.00);
        Runnable getAAPL = new GetTheStocks(stockGrabber, 2, "AAPL", 800.60);
        Runnable getGOOG = new GetTheStocks(stockGrabber, 2, "GOOG", 500.50);

        new Thread((getIBM)).start();
        new Thread((getAAPL)).start();
        new Thread((getGOOG)).start();
    }
}
/*
o padrão Observer é um padrão de design de software no qual um objeto, denominado assunto, mantém uma lista de
seus dependentes, chamados observadores, e os notifica automaticamente sobre quaisquer mudanças de estado,
geralmente chamando um de seus métodos.

                                    Quando usar?
quando você precisa de muitos outros objetos para receber uma atualização quando outro objeto muda

                                    Beneficio:
o acoplamento fraco é um benefício
                                    Negativo:
o Subject (editor) pode enviar atualizações que não importam para o Observador (assinante)

        */
