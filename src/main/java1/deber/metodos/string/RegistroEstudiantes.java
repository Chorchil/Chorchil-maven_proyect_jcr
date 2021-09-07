package deber.metodos.string;

import java.util.Scanner;

public class RegistroEstudiantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		int n;
		int contador=0;
		do {
			System.out.println("**********************");
			System.out.println("");
			System.out.println("1.Ingresar Estudiantes \n2.Buscar Estudiante \n3.SALIR.");
			System.out.println("");
			System.out.println("**********************");
			 n=lector.nextInt();
			 String estudiantes[]=new String[6];
			 estudiantes[0]="";
			 estudiantes[1]="";
			 estudiantes[2]="";
			 estudiantes[3]="";
			 estudiantes[4]="";
			 estudiantes[5]="";

			if(n==1) {
			
				System.out.println("Ingrese la cedula del estudiante: ");
			 
			 estudiantes[contador]=lector.nextLine();
			 estudiantes[contador++]=lector.nextLine();
			 estudiantes[contador++]=lector.nextLine();
			 estudiantes[contador++]=lector.nextLine();
			 estudiantes[contador++]=lector.nextLine();
			 estudiantes[contador++]=lector.nextLine();
			 

			}else if(n==2) {
				System.out.println("Ingrese la cedula del estudiante");
				for(int c=0;c<=5;c++) {
					String cEstudiante=lector.nextLine();
					if(estudiantes[c].equals(cEstudiante)) {
						 cEstudiante=lector.nextLine();
						boolean registro=estudiantes[c].equals(cEstudiante);
						System.out.println("El estudiante existe: "+registro);
					}System.out.println((estudiantes[c]+c));
				}
				
			}
			

		} while (n != 3);
		System.out.println("Fin del programa");
	}

}
