/* LISTAS (ArrayList, LinkedList, Vector, CopyOnWriteArrayList)
 * La colecci�n m�s b�sica de Java. Tambi�n es la m�s usada por los programadores que no han
 * investigado el framework de colecciones a fondo por hacernos pensar que se trata de una especie
 * de array supermejorado ya que hace su trabajo y es f�cil de entender. Sin embargo, hemos de
 * procurar asegurarnos de que cuando vas a usar una lista es porque realmente te hace falta, no 
 * porque no conoces el resto. La diferencia de rendimiento puede ser enorme y cuando digo enorme
 * me refiero a superior a un 500% en seg�n qu� operaciones.
 * 
 * VENTAJAS:
 * .- Acceso aleatorio.
 * .- Est�n ordenadas (Podemos usar Colections.sort() para ordenar los elementos siguiendo el
 *    criterio que queramos).
 * .- Podemos a�adir/eliminar elementos sin ninguna restricci�n.
 * .- Tienen un iterado especial ListIterator que permite modificar la lista en cualquier direcci�n-
 * .- Sig
 * uen la notaci�n de los arrays, por lo que son f�ciles de comprender.
 * DESVENTAJAS:
 * .- Bajo rendimiento en operaciones especializadas respecto a otras operaciones.
 */

/* ArrayList
 * Muy r�pida accediendo a elementos, relativamente r�pida agregando elementos si su capacidad
 * inicial y de crecimiento est�n bien configuradas. Es la lista que deber�as usar casi siempre.
 * 
 */

import java.util.ArrayList;

public class EjemploUsoArray {

	public static void main(String[] args) {

		EjemploUsoArray _ej=new EjemploUsoArray();
		ArrayList<String> ejemploLista = new ArrayList<String>();

		// 	A�ade elementos al ArrayList 
		ejemploLista.add("Elemento 1: posicion 0");
		ejemploLista.add("Elemento 2: posicion 1");
		ejemploLista.add("Elemento 3: posicion 2");
		String _ele4="Elemento 4: posicion 3"; 
		ejemploLista.add(_ele4);
		ejemploLista.add("Elemento 5: posicion 4");
		//Muestra los elementos del ArrayList
		_ej.muestraElementos(ejemploLista);
		// Devuelve el numero de elementos del ArrayList 
		System.out.println("El numero de elementos de"	+ " la lista es "+ejemploLista.size());
		// Devuelve el elemento de la posici�n '2' del ArrayList
		System.out.println("El elemento de la posicion"			+ " 2 de la lista es "+ejemploLista.get(2));
		// Comprueba existe _ele4 en la lista 
		System.out.println("La lista contiene al objeto"+_ele4+" ?"+ejemploLista.contains(_ele4));
		// Devuelve la posici�n de la primera ocurrencia del objeto _ele4 en ArrayList
		System.out.println("Y su indice es" +ejemploLista.indexOf(_ele4));
		// Borra el elemento de la posici�n '3' del ArrayList 
		System.out.println("Pasamos a borrar el elemento "	+ "de la posicion 1"); ejemploLista.remove(1);
		//Muestra los elementos del ArrayList
		_ej.muestraElementos(ejemploLista);
		// Borra la primera ocurrencia del objeto que que se le pasa 
		//como parametro.
		System.out.println("Pasamos a borrar el elemento de la posicion 3");
		ejemploLista.remove(_ele4);
		//Muestra los elementos del ArrayList
		_ej.muestraElementos(ejemploLista); 
		System.out.println("Borramos todos los elementos de la lista");
		//Borra todos los elementos de ArrayList 
		ejemploLista.clear();
		
		// Devuelve True si el ArrayList esta vacio. Sino 
		//Devuelve False
		System.out.println("La lista esta vac�a? "+ejemploLista.isEmpty());
	}
	
	public void muestraElementos(ArrayList<String> ejemploLista)
	{
		for (String ejemplo:ejemploLista) { 
			System.out.println(ejemplo);
		}
	}
}
