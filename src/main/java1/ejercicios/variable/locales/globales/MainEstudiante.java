package ejercicios.variable.locales.globales;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Estudiante esteban=new Estudiante();
esteban.setNombre("Jose");
System.out.println("El valor del atributo estatico es: "+Estudiante.provincia);
System.out.println("El valor del atributo estatico es: "+Estudiante.pais);
System.out.println("El valor del atributo de instancia es : "+esteban.getNombre());

	}

}
