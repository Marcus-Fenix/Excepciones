import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class CrearAchivoSecuencial {
	
	private ObjectOutputStream salida;
	
	public void abrirArchivo(String ruta){
		try {
			salida = new ObjectOutputStream(new  FileOutputStream(ruta));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("No se encontro Archivo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error con el flujo de salida");
		}
	}
	
	public void agregarRegistro(){
		RegistroCuentaSeriaLizable registro;
		int numeroCuenta = 0;
		String nombre;
		String apellido;
		double saldo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("%s\n%s\n%s\n%s\n\n",
				"Para terminar de introducir los datos, escriba el indicador",
				"Cuando se le pide que introduzca los datos.",
				"En unix/Linux/Mac OS X escribe los datos.",
				"En windows escribe <ctrl> z y oprima enter");
		System.out.printf("%s\n%s",
				"Escribe el nombre de cuenta ( >0 ), nombre, apellido y saldo","?");
		while(entrada.hasNext()){
			numeroCuenta = entrada.nextInt();
			nombre = entrada.next();
			apellido = entrada.next();
			saldo = entrada.nextDouble();
			if(numeroCuenta > 0){
				registro = new RegistroCuentaSeriaLizable(numeroCuenta, nombre, apellido, saldo);
				try {
					salida.writeObject(registro);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println("Entrada no valida");
					entrada.nextLine();
				}
			}
		}
 	}
	
	public void cerrarArchivo(){
		if(salida != null){
			try {
				salida.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("Error al cerrar el archivo");
			}
		}
	}

}
