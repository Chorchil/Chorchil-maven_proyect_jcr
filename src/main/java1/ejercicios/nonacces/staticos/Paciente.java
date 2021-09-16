package ejercicios.nonacces.staticos;

public class Paciente {
	private String nombre;
	private int edad;
	private static String nacionalidad="Ecuatoriano";
	private static int edadLimite=65;
	
	public void registrar(String nombre) {
		System.out.println("Se registra el paciente: "+nombre);
	}
	private static void consultarNacionalidad() {
		System.out.println();
	}
	public static void consultarNacionalidadStatica() {
		System.out.println("La nacionalidad es: "+nacionalidad);
	}
	
	//METODOS GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public static String getNacionalidad() {
		return nacionalidad;
	}
	public static void setNacionalidad(String nacionalidad) {
		Paciente.nacionalidad = nacionalidad;
	}
	public static int getEdadLimite() {
		return edadLimite;
	}
	public static void setEdadLimite(int edadLimite) {
		Paciente.edadLimite = edadLimite;
	}
	
	
	
	
	

}
