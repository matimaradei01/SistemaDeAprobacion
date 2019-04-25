import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private Integer edad;
	private double promedio;
	private Integer contador = 0;

	ArrayList<Asignatura> materias = new ArrayList<Asignatura>();

	public Alumno(String nombre, Integer edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

	public void consultarPromedio() {

		for (Asignatura a1 : materias) {

			promedio += a1.getNotaObtenida();
			contador++;

		}
		promedio = promedio / contador;
		System.out.println("--------------------------------------------");
		System.out.println("El promedio del alumno "+nombre+" es " + promedio);
		System.out.println("--------------------------------------------");

	}

	public void agregarAsignatura(Asignatura a) {

		if (materias.contains(a)) {
			System.out.println("Existente");
		} else {
			materias.add(a);
		}
	}

	public void verListaDeAsignaturas() {

		for (int i = 0; i < materias.size(); i++) {

			System.out.println(materias.get(i));

		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
