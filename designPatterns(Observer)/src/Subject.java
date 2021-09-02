public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();


}
/*
    quando você precisa de muitos outros objetos para receber uma atualização quando outro objeto muda

        o acoplamento fraco é um benefício

        negativo: o assunto (editor) pode enviar atualizações que não importam para o Observador (assinante)

        o padrão Observer é um padrão de design de software no qual um objeto, denominado assunto, mantém uma lista de seus dependentes, chamados observadores, e os notifica automaticamente sobre quaisquer mudanças de estado, geralmente chamando um de seus métodos.
        */

