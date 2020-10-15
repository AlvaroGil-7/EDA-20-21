package tools;

public class Lista {

	public NodoLista primero;
	
	// Constructores
	
	/**
	 * Constructor de lista vac�a
	 */
	public Lista() {
		primero = null;
	}
	
	/**
	 * Constructor con un elemento
	 * @param primero
	 */
	public Lista(NodoLista primero) {
		this.primero = primero;
	}
	
	/*
	 * Operaciones del TAD
	 * isEmpty(): Determina si la lista es vac�a
	 * insertHead(x): Inserta el elemento x al principio de la lista, ser� el nuevo primer elemento.
	 * insertLast(x): Inserta el elemento x al final de la lista, ser� el �ltimo elemento.
	 * insertAtPosition(n,x): Inserta el  elemento x despu�s del elemento en la posici�n n
	 * find(x): Devuelve la posici�n del elemento x
	 * remove(x): Elimina el elemento x
	 * previous(x): Devuelve el elemento anterior al elemento x 
	 * first(): Devuelve el primer elemento de la lista 
	 * last(): Devuelve el �ltimo elemento de la lista
	 * clear(): Vac�a la lista
	 * */
	
	public boolean isEmpty() {
		if (primero.equals(null))return true;
		else return false;
		
	}
	
	public void clear() {
		primero = null;
	}
	
	//insertHead(x): Inserta el elemento x al principio de la lista, ser� el nuevo primer elemento.
	
	public Lista insertHead(Object dato) {
		NodoLista nodo = new NodoLista(dato, primero);
		primero = nodo;
		return this;
	}
	
	
	
	/*
	 * Bonus
	 * printList(): imprime la lista por pantalla
	 * size(): devuelve el tama�o de la lista
	 */
}
