
import java.util.*;

class Alumnos{
	private int nota;
	private String nombre;
	public void setNota(int nota){
		this.nota = nota;
	}public int getNota( ){
		return this.nota;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getNombre( ){
		return this.nombre;
	}
}
class ComparaNota implements Comparator{/**hay que implementar la interfazComparator y definir el método compare()*/
	
	public int compare (Object alum1, Object alum2){
		int alum1Nota = ((Alumnos)alum1).getNota( );//hacemos un casting
		int alum2Nota = ((Alumnos)alum2).getNota( );
		if(alum1Nota > alum2Nota){//ordenamos de mayor a menor
			return -1;
		}else if(alum1Nota < alum2Nota){
			return 1;
		}else{
			return 0;
		}
	}
}
class ComparaNombre implements Comparator{
	public int compare(Object alum1, Object alum2){
		String alum1Nombre = ((Alumnos) alum1).getNombre( ); 
		String alum2Nombre = ((Alumnos) alum2).getNombre( );
		return alum1Nombre.compareTo(alum2Nombre);/**usamos el método compareTo
	para un orden alfabético*/
	}
}
