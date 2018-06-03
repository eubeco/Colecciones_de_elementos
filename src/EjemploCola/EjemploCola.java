package EjemploCola;

/* COLAS (ArrayDeque, LinkedBlocklingDeque, LinkedList, PriorityQueue)
 * Las colas son estructuras que ofrecen un gran redimiento al obtener elementos de su principio
 * o de su final, representando colas LIFO/FIFO, aunque veremos colas ordenadas en función de otros 
 * criterios.
 * Deberás usar una cola cuando vayas a recuperar siempre el primer o último elemento de una serie.
 * Se usan para implementar las mencionadas colas LIFO/FIFO, así como colas de prioridades (como 
 * puede ser un sistema de tareas o procesos).
 * Cabe destacar que hay dos tipos de colas, QUEUES y DEQUES, las primeras solo proporcionan métodos 
 * para acceder al último elemento de la cola, mientras que las DEQUES permiten acceder a cualquiera
 * de los dos extremos
 * 
 * VENTAJAS:
 * .- Ofrecen un gran rendimiento al recuperar el primer o último objeto de la cola.
 * .- Permiten crear estructuras LIFO/FIFO o colas de prioridad con muy buen rendimiento.
 * 
 * DESVENTAJAS:
 * .- La iteración por las colas (para leer todos sus elementos) suele ser muy lenta.
 * .- El acceso aleatorio, de la misma manera, es muy lento
 * 
 */


/* ArrayDeque
 * Una implementación de Deque (colección lineal de elementos que permite insersión en ambos lados)
 * de rendimiento excepcional. Implementa tanto cola LIFO como FIFO al ser una Deque y el la Cola 
 * que deberías usar si quieres implementar una de estas dos estructuras. 
 */

import java.util.ArrayDeque;
import java.util.Iterator;

public class EjemploCola {


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