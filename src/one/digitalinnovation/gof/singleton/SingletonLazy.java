package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author Alemaof
 */
public class SingletonLazy {


    //Instanciado dentro da própria classe.
    private static SingletonLazy instancia;

    //Construtor privado. Explicitar a chamada do construtor é opcional.
    private SingletonLazy() {
        super();
    }

    //Somente a própria classe consegue instanciar.
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
