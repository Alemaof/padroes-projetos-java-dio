package one.digitalinnovation.gof.singleton;

/**
 *  Singleton "apressado".
 *
 * @author Alemaof
 */
public class SingletonEager {

    //A instancia já é inicializada assim que a classe for chamada
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
