
import java.util.*;
public class EjemploIterador {


	public static void main( String args[] ) {
		// Creamos la lista de elementos de prueba
		List lista = new ArrayList();
		lista.add( "linea 1" );
		lista.add( "linea 2" );
		lista.add( "linea 3" );
		lista.add( "linea 4" );
		lista.add( "linea 5" );
		lista.add( "linea 6" );
		lista.add( "linea 7" );
		// Creamos el iterador que utilizaremos para recorrer la lista 
		Iterator iterador = lista.iterator();		
		for( int i=0; iterador.hasNext(); i++ ) {
			String elemento = (String)iterador.next();
			// Imprimimos la lista original
			System.out.println( elemento );
		}
	}
}