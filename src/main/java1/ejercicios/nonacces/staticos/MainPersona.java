package ejercicios.nonacces.staticos;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1=new Paciente();
		paciente1.setNombre("Esteban");
		paciente1.setEdad(23);
		paciente1.registrar(paciente1.getNombre());
		Paciente.consultarNacionalidadStatica();
	}

}
