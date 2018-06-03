/*
 * MAPS (HashMap, LinkedHashMap, TreeMap, EnumMap, WeakHashMap, HashTable, ConcurrentHashMap)
 * Los maps son colecciones que asocian un valor con una clave. Tanto la clave como el valor
 * pueden ser cualquier tipo de datos de Java: Objetos, datos primitivos, otras colecciones, etc.
 * Las implementaciones son muy parecidas a los Sets debido a que, internamente utilizan un Set
 * (la implementaci�n var�a seg�n el tipo de Map) para garantizar que no hay elementos duplicados
 * en las claves.
 * 
 * VENTAJAS:
 * .- Asociaci�n clave -> valor.
 * .- Gracias a que internamente usan un Set se garantiza que no habr� dos claves iguales.
 * .- Es f�cil reconocer cuando necesitamos usar un Map.
 * 
 * DESVENTAJAS:
 * .- Rendimiento no muy elevado comparado con otras colecciones.
 * 
 */


/*
 * HashMap
 * La implementaci�n m�s gen�rica de Map. Un array clave->valor que no garantiza el orden
 * de las claves (de la misma forma que un HashSet). Si necesitas un Map no-concurrente que
 * no requiera ordenaci�n de clves, este es el tuyo.
 */



import java.util.HashMap;
import java.util.Map.Entry;

public class EjemploHashMap {
	
	public static void main(String[] args) {
		
		HashMap<String, String> mapDNIs = new HashMap<String, String>();
		
		mapDNIs.put("34563782G", "Juan Perez"); 
		mapDNIs.put("13784267H", "Fermin Lopez"); 
		mapDNIs.put("12986512J", "Christian Alvarez"); 
		mapDNIs.put("22669123O", "Jesus Andres");
		
		for(Entry<String, String> e: mapDNIs.entrySet())
		{
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		//El elemento cuyo DNI es "12986512J" 
		System.out.println("La persona cuyo DNI es 12986512J se llama "+mapDNIs.get("12986512J"));
	}
}