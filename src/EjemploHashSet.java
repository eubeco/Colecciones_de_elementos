

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