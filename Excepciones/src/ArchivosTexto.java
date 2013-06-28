import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ArchivosTexto {
	
	private String rutaArchivo;
	private File archivo;
	private FileReader fr;
	private BufferedReader br;
	private PrintWriter pw;
	private FileWriter fw;
	
	public ArchivosTexto(String ruta){
		this.rutaArchivo = ruta;
	}
	
	public void LeerArchivo(){
		archivo = new File(this.rutaArchivo);
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			String Linea;
			while((Linea = br.readLine()) != null){
				System.out.println(Linea);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("No existe el archivo "+ this.rutaArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("No hay texto en el archivo ");
		}
		finally{
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println("Error al cerrar el archivo");
				}
			}
		}
	}
	
	public void EscribirArchivo(){
		try {
			fw = new FileWriter(this.rutaArchivo);
			pw = new PrintWriter(fw);
			for(int x = 0; x < 10; x++){
				pw.println("Linea: " + x);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error de Archivo");
		}
		finally{
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.err.println("Error al cerrar el archivo");
				}
			}
		}
	}

}
