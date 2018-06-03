/* SETS (HashSet, LinkedHashSet, TreeSet, EnumSet, CopyOnWriteArraySet, ConcurrentSkipListSet)
 * Los sets o conjuntos son colecciones que por norma general no admiten elementos iguales en
 * su interior. Dos elementos A y B son iguales si A.equals(B).
 * Podemos a�adir y eliminar elementos de un set as� como saber si determinado elemento est�
 * en un set, pero no tenemos acceso aleatorio, por lo que hay que tener muy claro cuando
 * queremos usarlos.
 * Una colecci�n normal, en apariencia, nos da todo lo anterior excepto el hecho de eliminar
 * duplicados, as� que �Porqu� usar un Set y no una lista? El motivo es simple por EFICIENCIA.
 * 
 * VENTAJAS:
 * .- No permiten elementos duplicados.
 * .- Implementaci�n muy eficiente de .add para asegurarnos de que no hay duplicados.
 * 
 * DESVENTAJAS:
 * .- No tienen acceso aleatorio.
 * .- Solo algunos tipos de set pueden ordenarse y lo hacen de forma poco eficiente.
 */

/*
 * HashSet
 * La implementaci�n m�s equilibrada de la interfaz Set. Es r�pida y no permite duplicados,
 * pero no tiene ning�n tipo de ordenaci�n. Util�zala si necesitas un control de duplicados
 * pero ning�n tipo de ordenaci�n ni acceso aleatorio.
 */



import java.util.HashSet;
import java.util.Iterator;
public class EjemploHashSet {
	public static void main(String[] args) {
		
		HashSet provicias = new HashSet();
		provicias.add ("VALENCIA");
		provicias.add ("MADRID");
		provicias.add ("BARCELONA");
		//Estas lineas no la hace efectiva ya que no permite duplicados
		provicias.add ("VALENCIA");
		provicias.add ("VALENCIA");
		provicias.add ("VALENCIA");
		Iterator iterador = provicias.iterator();
		while (iterador.hasNext()) {
			String elemento = (String) iterador.next(); System.out.println(elemento + " ");
		}
	}
}