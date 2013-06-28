import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class LeerArchivoSecuencial {
	
	private ObjectInputStream entrada;
	
	public void abrirArchivo(String ruta){
		try {
			entrada = new ObjectInputStream(new FileInputStream(ruta));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Archivo no encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error al abrir el archivo");
		}
	}
	
	public void LeerArchivo(){
		RegistroCuentaSeriaLizable registro;
		
		System.out.printf("%-10s%-15s%-15s%10s\n","Cuenta","Nombre","Apellido","Saldo");
		
		while(true){
			try {
				registro = (RegistroCuentaSeriaLizable) entrada.readObject();
				System.out.printf("%-10d%-15s%-15s%11.2f\n",
						           registro.getCuenta(),registro.getNombre(),
						           registro.getApellido(),registro.getSaldo());
			}catch(EOFException e){
				return;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println("Error al leer el archivo");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println("Archivo no encontrado");
			}
		}
	}
	
	public void CerrarArchivo(){
		if(entrada != null){
			try {
				entrada.close();
				System.exit(1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Error al cerrar el archivo");
			}
			
		}
	}

}
