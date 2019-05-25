import java.sql.Date;

public class Persona {
	//atributos
	private String nombre;
	private int edad;
	private Date fechaNacimiento;
	//constructor
	public Persona(String nombre, int edad, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento=fechaNacimiento;
	}
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}	
}
