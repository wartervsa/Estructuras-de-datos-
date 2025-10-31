package EstructurasDeDatis.EDL;

public class ListaSE<T> implements Lista<T>{
    private         T ini;
    private ListaSE<T> sig;
    
    public ListaSE() {
        ini = null;
        sig = null;
    }
    
    /**
     * si la lista no tiene datos, te retorna true, pero si tiene al menos un elemento te retorna false
     * @param 
     * return boolean
     */
    public boolean esVacia() {
        return ini == null;
    }
    
    /**
     * inserta el dato en a lista
     * @param T dato
     * return nada
     */
    public void insertar(T dato) {
        if (esVacia()) {
            ini = dato;
            sig = new ListaSE<T>();
        } else {
            sig.insertar(dato);
        }
    }
    
    /**
     * Si no es vacia te retorna un T dato, si no te retorna null
     * @param
     * return T dato
     */
    public T acceder(int pos) {
        T dato;
        if (!esVacia()) {
            if (pos == 0) {
                dato = ini;
            } else {
                dato = sig.acceder(pos - 1);
            }
        } else {
            dato = null;
        }
        return dato;
    }
    
    /**
     * Elimina el ultimo dato de la lista, si no tiene datos hace nada
     * @param
     * return nada
     */
    public void eliminar() {
        if (sig.esVacia()) {
            ini = null;
        } else {
            sig.eliminar();
        }
    }
    
    /**
     * si encuentra la pos posicion elimina el dato y retorna true, si no retorna false
     * @param int pos
     * return boolean
     */
    public boolean eliminar(int pos) {
        boolean verif;
        if (!esVacia()) {
            if (pos == 0) {
                ini = sig.ini;
                sig = sig.sig;
                verif = true;
            } else { 
                verif = sig.eliminar(pos - 1);
            }
        } else {
            verif = false;
        }
        return verif;
    }
    
    /**
     * Te devuelve el tamano de la lista, si no tiene datos devuelve 0
     * @param
     * return el tamano int
     */
    public int tamano() {
        int tam = 0;
        if (!esVacia()) {
            tam = 1 + sig.tamano();
        }
        return tam;
    }
    
    /**
     * busca la posicion pos y si existe la reemplaza con T dato, si no hace nada
     * @param int pos, T dato
     * return nada
     */
    public boolean reemplazar(T dato, int pos) {
        boolean seLogro;
        if (!esVacia()) {
            if (pos == 0) {
                ini = dato;
                seLogro = true;
            } else {
                seLogro = sig.reemplazar(dato, pos - 1);
            }
        } else {
            seLogro = false;
        }
        return seLogro;
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
        boolean encontrado;
        if (!esVacia()) {
            if (ini == dato) {
                encontrado = true;
            } else {
                encontrado = sig.buscar(dato);
            }
        } else {
            encontrado = false;
        }
        return encontrado;
    }
    /**
     * Si encuentra la pos posicion devuelve el dato, si no retorna null
     * @param int pos 
     * return T dato
     */
    public T buscar(int pos) {
        T dato;
        if (!esVacia()) {
            if (pos == 0) {
                dato = ini;
            } else {
                dato = sig.buscar(pos - 1);
            }
        } else {
            dato = null;
        }
        return dato;
    }
    /**
     * Inserta el T dato en la pos posicion si la posicion existe, si no hace nada
     * @param T dato, int pos 
     * return boolean 
     */
    public boolean insertar(T dato, int pos) {
        boolean hecho;
        if (!esVacia()) {
            if (pos == 0) {
                ListaSE<T> listaSig = new ListaSE<T>();
                T aux = ini;
                ini = dato;
                listaSig.ini = aux;
                listaSig.sig = sig;
                sig = listaSig;
                hecho = true;
            } else {
                hecho = sig.insertar(dato, pos - 1);
            }
        } else {
            hecho = false;
        }
        return hecho;
    }
}
