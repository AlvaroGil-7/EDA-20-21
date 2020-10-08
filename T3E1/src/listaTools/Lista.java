package listaTools;
public class Lista {

	public NodoLista primero;

	public Lista() {
		// TODO
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
	
	public Lista insertHead(Object o) {
		
		// Crea un nuevo nodo
		NodoLista nuevoNodo = new NodoLista(o);

		// Enlaza el nuevo nodo al frente de la lista
		nuevoNodo.siguienteNodo = primero;
		primero = nuevoNodo;

		// Devuelve esta lista
		return this;

	}
		
	/*
	 * Bonus
	 * printList(): imprime la lista por pantalla
	 * size(): devuelve el tama�o de la lista
	 */

	
	
}
