package EstructurasDeDatos.EDL;

public class ListaDE<T> implements Lista<T>{
    
    private NodoDE<T> ini;
    
    public ListaDE() {
        ini = null;   
    }
    
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
        
    }
    /**
     * Si encuentra la pos posicion devuelve su dato, si no devuelve null
     * @param
     * return T dato
     */
    public T acceder(int pos) {
        return null;
    }
    /**
     * Elimina el ultimo dato de la lista, si no tiene datos hace nada
     * @param
     * return nada
     */
    public void eliminar() {
        
    }
    /**
     * si encuentra la pos posicion elimina el dato y retorna true, si no retorna false
     * @param int pos
     * return boolean
     */
    public boolean eliminar(int pos) {
        return false;
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
     * Si encuentra el T dato te retorna ese dato, si no retorna null
     * @param T dato
     * return boolean 
     */
    public boolean buscar(T dato) {
        return false;
    }
    /**
     * Si encuentra la pos posicion devuelve el dato, si no retorna null
     * @param int pos 
     * return T dato
     */
    public T buscar(int pos) {
        return null;
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
