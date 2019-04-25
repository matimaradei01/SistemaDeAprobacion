import java.util.ArrayList;

public class Aplicacion {

	public static void main(String[] args) {

		Asignatura as1 = new Asignatura("Matematica", 6);
		Asignatura as2 = new Asignatura("Ingles", 8);
		Asignatura as3 = new Asignatura("Matematica", 6);
		Asignatura as4 = new Asignatura("Programacion Basica", 8);

		Alumno al1 = new Alumno("Matias", 22);
		Alumno al2 = new Alumno("Fernando", 44);
		Alumno al3 = new Alumno("Cristina", 50);
		
		as1.aprobadoODesaprobado();
		
		al1.agregarAsignatura(as1);
		al1.agregarAsignatura(as2);
		al1.agregarAsignatura(as4);
		al1.verListaDeAsignaturas();
		al1.consultarPromedio();
		
		al2.agregarAsignatura(as3);
		al2.agregarAsignatura(as4);
		al2.verListaDeAsignaturas();
		al2.consultarPromedio();
		
	}

}
