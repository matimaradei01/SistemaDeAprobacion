
public class Asignatura {

	private String asignatura;
	private Integer notaObtenida;
	private Integer promedio = 0;

	public Asignatura(String asignatura, Integer notaObtenida) {

		this.asignatura = asignatura;
		this.notaObtenida = notaObtenida;

	}

	public void aprobadoODesaprobado() {

		promedio += notaObtenida;
		if (promedio >= 7) {
			System.out.println("--------------------------------------------");
			System.out.println("La materia "+asignatura+" esta aprobado");
			System.out.println("--------------------------------------------");
		} else {
			System.out.println("--------------------------------------------");
			System.out.println("La materia "+asignatura+" esta desaprobado");
			System.out.println("--------------------------------------------");
		}
	}

	public String getAsignatura() {
		return asignatura.toString();
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public Integer getNotaObtenida() {
		return notaObtenida;
	}

	public void setNotaObtenida(Integer notaObtenida) {
		this.notaObtenida = notaObtenida;

	}

	@Override
	public String toString() {
		return "Materia: " + asignatura + "\n" + "Nota obtenida = " + notaObtenida + "\n";
	}

}
