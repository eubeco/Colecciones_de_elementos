package EjemploCola;

import java.util.ArrayDeque;
import java.util.Iterator;

public class EjemploCola {
	/* Ventajas de las colas:
	 * .- Ofrecen un gran rendimiento al recuperar el primer o �ltimo objeto de la cola.
	 * .- Permiten crear estructuras LIFO/FIFO o colas de prioridades con muy buen rendimiento.
	 * 
	 * Desventajas de las colas:
	 * .- La iteraci�n por las colas (para leer todos sus elementos) suele ser muy lenta.
	 * .- El acceso aleatorio, de la misma manera, es muy lento.
	 */
	 
	/* Tipos de colas:
	 * 
	 * ArrayDeque: 
	 *  .- Una implementaci�n de Deque (colecci�n lineal de elementos que permite inserci�n en 
	 *  ambos lados) de rendimiento excepcional. Implenta tanto la cola LIFO como FIFO al ser
	 *  una Deque y es la Cola que deber�a usar si quieres implementar una de estas dos
	 *  estructuras. 
	 */
	
	
	
	public static void main(String[] args) {
		
		ArrayDeque<String> cola= new ArrayDeque<String>(); 
		cola.add("A");
		cola.add("B");
		cola.add("C");
		//offerFirst inserta elementos al principio de ArrayDeque 
		cola.offerFirst("D");
		//offerLast inserta elementos al final de ArrayDeque 
		cola.offerLast("E");
		Iterator<String> itr= cola.iterator();
		while(itr.hasNext()){ System.out.println(itr.next());
		}
	}
}