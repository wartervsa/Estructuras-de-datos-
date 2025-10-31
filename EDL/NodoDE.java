package EstructurasDeDatos.EDL;

public class NodoDE<T>{
    private NodoDE<T> ant;
    private NodoDE<T> suc;
    private        T dato;
    
    public NodoDE(T dato) {
        this.dato = dato;
        ant =
        suc = new NodoDE(dato);
    }
}
