/* SETS (HashSet, LinkedHashSet, TreeSet, EnumSet, CopyOnWriteArraySet, ConcurrentSkipListSet)
 * Los sets o conjuntos son colecciones que por norma general no admiten elementos iguales en
 * su interior. Dos elementos A y B son iguales si A.equals(B).
 * Podemos añadir y eliminar elementos de un set así como saber si determinado elemento está
 * en un set, pero no tenemos acceso aleatorio, por lo que hay que tener muy claro cuando
 * queremos usarlos.
 * Una colección normal, en apariencia, nos da todo lo anterior excepto el hecho de eliminar
 * duplicados, así que ¿Porqué usar un Set y no una lista? El motivo es simple por EFICIENCIA.
 * 
 * VENTAJAS:
 * .- No permiten elementos duplicados.
 * .- Implementación muy eficiente de .add para asegurarnos de que no hay duplicados.
 * 
 * DESVENTAJAS:
 * .- No tienen acceso aleatorio.
 * .- Solo algunos tipos de set pueden ordenarse y lo hacen de forma poco eficiente.
 */

/*
 * HashSet
 * La implementación más equilibrada de la interfaz Set. Es rápida y no permite duplicados,
 * pero no tiene ningún tipo de ordenación. Utilízala si necesitas un control de duplicados
 * pero ningún tipo de ordenación ni acceso aleatorio.
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