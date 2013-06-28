
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArchivoDemo ad = new ArchivoDemo();
		//ad.AnalizarRuta("C:/Users/MARCUS/Documents/hola.txt");
		//ArchivosTexto add = new ArchivosTexto("C:/Users/MARCUS/Documents/hola.txt");
		//add.EscribirArchivo();
		//dd.LeerArchivo();
		
		//CrearArchivo cuenta = new CrearArchivo();
		//cuenta.abrirArchivo("C:/Users/MARCUS/marcos.txt");
		//cuenta.agregarRegistro();
		//cuenta.cerrarArchivo();
		
		CrearAchivoSecuencial app1 = new CrearAchivoSecuencial();
		app1.abrirArchivo("C:/Users/MARCUS/Cliente.txt");
		app1.agregarRegistro();
		app1.cerrarArchivo();
		
		LeerArchivoSecuencial app = new LeerArchivoSecuencial();
		app.abrirArchivo("C:/Users/MARCUS/Cliente.txt");
		app.LeerArchivo();
		app.CerrarArchivo();
	}	
}
