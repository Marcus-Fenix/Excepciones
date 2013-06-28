import java.io.Serializable;


public class RegistroCuentaSeriaLizable implements Serializable{
	
	private int Cuenta;
	private String nombre;
	private String apellido;
	private double saldo;
	
	public RegistroCuentaSeriaLizable(){
		Cuenta = 0;
		nombre = "";
		apellido = "";
		saldo = 0;
	}
	
	public RegistroCuentaSeriaLizable(int Cuenta, String nombre, String apellido, double saldo){
		this.Cuenta = Cuenta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.saldo = saldo;
	}
	
	public int getCuenta() {
		return Cuenta;
	}
	
	public void setCuenta(int cuenta) {
		Cuenta = cuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
