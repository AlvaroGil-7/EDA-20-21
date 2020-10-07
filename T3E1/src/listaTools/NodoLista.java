package listaTools;

public class NodoLista {

	Object dato;
	NodoLista siguienteNodo;
	
	/*
	 * Constructores de nodos para una lista simplemente enlazada
	 * */
	NodoLista (Object dato) {
		
		// Equivalentemente, this(dato, null) llama al constructor de abajo con esos par�metros
		this.dato = dato;
		this.siguienteNodo = null; 
		// Por defecto siguienteNodo ya ser�a null pero lo ponemos expl�citamente por claridad
		
	}

	NodoLista (Object dato, NodoLista siguienteNodo) {
		this.dato = dato; 
		this.siguienteNodo = siguienteNodo;
	}	
}
