

import java.util.Arrays;

public class EjemploComparador{//creamos el array y le añadimos valores
	public static void main(String[ ] args){
		//Creamos el listado y lo rellenamos 
		Alumnos alumnos[ ] = new Alumnos[3]; 
		alumnos[0] = new Alumnos( ); 
		alumnos[0].setNota(8); 
		alumnos[0].setNombre("Ana"); 
		alumnos[1] = new Alumnos( ); 
		alumnos[1].setNota(6); 
		alumnos[1].setNombre("Jose"); 
		alumnos[2] = new Alumnos( ); 
		alumnos[2].setNota(3); 
		alumnos[2].setNombre("Carlos");
		
		System.out.println("Alumnos desordenados");
		for(int i = 0; i<alumnos.length;i++){
			System.out.println("Alumno "+(i+1)+" Nombre: "+alumnos[i].getNombre()
					+" Nota: "+alumnos[i].getNota( ));
		}
		Arrays.sort(alumnos, new ComparaNota( ));/**usamos el método sort para ordenar las notas*/System.out.println("Alumnos ordenados por notas");
		for(int i = 0; i<alumnos.length; i++){
			System.out.println("Alumno "+(i+1)+" Nombre: "+alumnos[i].getNombre()
					+" Nota: "+alumnos[i].getNota( ));
		}
		Arrays.sort(alumnos, new ComparaNombre( ));/**ahora ordenamos los nombres*/
		System.out.println("Alumnos ordenados por nombre");
		for(int i = 0;i<alumnos.length; i++){
			System.out.println("Alumno "+(i+1)+" Nombre: "+alumnos[i].getNombre()
					+" Nota: "+alumnos[i].getNota( ));
		}
	}
}