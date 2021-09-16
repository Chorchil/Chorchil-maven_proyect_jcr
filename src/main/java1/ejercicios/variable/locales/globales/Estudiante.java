package ejercicios.variable.locales.globales;

public class Estudiante {
private String nombre;
private String cedula;
public static final String PAIS="Ecuador";
//Pertenece a la instancia
public void caminar() {
	
}

//Pertenece a la clase
public static void comer() {
	
}



//metodos GET Y SET

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getCedula() {
	return cedula;
}
public void setCedula(String cedula) {
	this.cedula = cedula;
}
public static String getPais() {
	return PAIS;
}


}
