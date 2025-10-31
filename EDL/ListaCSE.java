package EstructurasDeDatis.EDL;

public class ListaCSE<T> implements Lista<T>{
    /**
     * si la lista no tiene datos, te retorna true, pero si tiene al menos un elemento te retorna false
     * @param 
     * return boolean
     */
    public boolean esVacia() {
        return false;
    }
    /**
     * inserta el dato en a lista
     * @param T dato
     * return nada
     */
    public void insertar(T dato) {
        return null;
    }
    /**
     * Te devuelve el tamano de la lista, si no tiene datos devuelve 0
     * @param
     * return el tamano int
     */
    public int tamano() {
        return 0;
    }
    /**
     * busca la posicion pos y si existe la reemplaza con T dato, si no hace nada
     * @param int pos, T dato
     * return nada
     */
    public boolean reemplazar(T dato, int pos) {
        return false;
    }
    /**
     * hace una copia de toda la lista, si no tiene datos hace nada
     * @param 
     * return Lista
     */
    public void clon() {
        
    }
    /**
     * Inserta el T dato en la pos posicion si la posicion existe, si no hace nada
     * @param T dato, int pos 
     * return boolean 
     */
    public boolean insertar(T dato, int pos) {
        return false;
    }
}
