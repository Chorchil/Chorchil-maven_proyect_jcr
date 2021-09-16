package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// byte
		byte datoByte=2;	
		Byte datoByteWrapper=3;	//wrapper
		System.out.println("PRIMITIVO: "+datoByte);
		System.out.println("Wrapper"+datoByteWrapper);
		//conversiones
		byte datoByte1=6;
		Byte datoConvertido=datoByte1;
		System.out.println("Byte convertido: "+ datoConvertido);
		//converisiones 2
		Byte datoConvertido2=6;
		byte datoByte2=datoConvertido2.byteValue();
		System.out.println("byte convertido: "+datoByte2 );
		
		//short 
		short datoShort=12;// primitivo
		Short datoShortWrapper=55;	//wrapper
		System.out.println("PRIMITIVO: "+datoShort);
		System.out.println("Wrapper"+datoShortWrapper);
		//conversiones
		short datoShort1=4;
		Short shortConvertido=datoShort1;
		System.out.println("Short convertido: "+ shortConvertido);
		//conversiones 2
		Short shortConvertido2=23;
		short datoShort2=shortConvertido2.shortValue();
		System.out.println("short convertido: "+datoShort2);
		
		//int
		int edad=45; //primitivo
		Integer edadWrapper=48;//wrapper
		System.out.println("PRIMITIVO: "+edad);
		System.out.println("Wrapper"+edadWrapper);
		//conversiones
		int edad1=65;
		Integer integerConvertido=edad1;
		System.out.println("Integer convertido: "+integerConvertido);
		//conversiones 2
		Integer integerConvertido2=54;
		int edad2=integerConvertido2.intValue();
		System.out.println("int convertido: "+ edad2);
		
		//long 
		long valor=125;//primitivo
		Long valorWrapper=4646464L;//wrapper
		System.out.println("PRIMITIVO: "+valor);
		System.out.println("Wrapper"+valorWrapper);
		//conversiones
		long valor2=234L;
		Long valorWrapper2=valor2;
		System.out.println("Long convertido: "+valorWrapper2);
		//conversiones 2
		Long valorWrapper3=12345L;
		long valor3=valorWrapper3.longValue();
		System.out.println("long convertido: "+valor3);
				
		//boolean
		boolean test=true;//primitivo
		Boolean testWrapper=false;//wrapper
		System.out.println("PRIMITIVO: "+test);
		System.out.println("Wrapper"+testWrapper);
		//conversiones
		boolean taller=false;
		Boolean tallerWrapper=taller;
		System.out.println("Boolean convertido: "+tallerWrapper);
		//conversiones 2
		Boolean tallerWrapper2=true;
		boolean taller2=tallerWrapper2.booleanValue();
		System.out.println("boolean convertido; "+taller2);
		
		//float
		float saldo=42.5F;//primitivo
		Float sadoWrapper=85.5F;//wrapper
		System.out.println("PRIMITIVO: "+saldo);
		System.out.println("Wrapper"+sadoWrapper);
		//conversiones 
		float pago=34.3F;
		Float pagoWrapper=pago;
		System.out.println("Float convertido: "+pagoWrapper);
		//converiones 2
		Float bonoWrapper=655.33F;
		float bono=bonoWrapper.floatValue();
		System.out.println("float convertido: "+bono);
		
		
		//double
		double decimo=45.5;//primitivo
		Double decimoWrapper=98.6;//wrapper
		System.out.println("PRIMITIVO: "+decimo);
		System.out.println("Wrapper"+decimoWrapper);
		//conversiones
		double renta=250.5;
		Double rentaWrapper=renta;
		System.out.println("Double convertido: "+rentaWrapper);
		//conversiones 2 
		Double pensionWrapper=200.75;
		double pension=pensionWrapper.doubleValue();
		System.out.println("double convertido: "+pension);
		
		
		//char
		char prueba='j';//primitivo
		Character pruebaWrapper='h';//wrapper
		System.out.println("PRIMITIVO: "+prueba);
		System.out.println("Wrapper"+pruebaWrapper);
		//conversiones 
		char letra='w';
		Character letraWrapper=letra;
		System.out.println("Character convertido: "+letraWrapper);
		//conversiones 2
		Character letterWrapper='q';
		char letter=letterWrapper.charValue();
		System.out.println("char convertido: "+letter);
		
		
	}

}
