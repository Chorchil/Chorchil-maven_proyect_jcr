package ejercicios.clase.string;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Contains
		
		String frase="Programacion de algoritmos módulo II";
		Scanner lector=new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		String palabra=lector.nextLine();
		boolean resultado=frase.contains(palabra);
		System.out.println("Contiene la palabra: "+resultado); 
		
		//2.Equals
		System.out.println("*********************************");
		String cadena1="Jordan";
		System.out.println("ingrese la segunda cadena a comparar");
		String cadena2=lector.nextLine();
		boolean resultado2=cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales?: "+resultado2);
		System.out.println("*********************************");
		
		//3 y 4. Upper Lowerr		
		System.out.println("*********************************");
		String nombre="Esteban";
		String nombreMayuscula=nombre.toUpperCase();
		System.out.println("Nombre en mayuscula: "+nombreMayuscula);
		
		String nombre2="JOSE";
		String nombreMinuscula=nombre2.toLowerCase();
	}

}
