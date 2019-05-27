import java.sql.Date;
/**
 * 
 * @author Laura Massanet Puentes
 *
 */
public class Persona {
	
	//atributos
	/**
	 * Atributo nombre define el nombre de la persona
	 */
	private String nombre;
	/**
	 * Atributo edad define la edad de la persona
	 */
	private int edad;
	/**
	 * Atributo fechaNacimiento define la fecha de nacimiento 
	 */
	private Date fechaNacimiento;
	//constructor
	/**
	 * 
	 * @param nombre de tipo String y define el nombre de la persona
	 * @param edad de tipo int y define la edad de la persona
	 * @param fechaNacimiento de tipo Date y define la fecha de nacimiento de la persona
	 * Este es el constuctor que inicializa los atributos de la persona
	 */
	public Persona(String nombre, int edad, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.fechaNacimiento=fechaNacimiento;
	}
	//getters y setters
	/**
	 * 
	 * @return nombre de tipo String
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre de tipo String que establece el valor del atibuto nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return edad de tipo int
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad de tipo int que establece el valor del atibuto edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return fechaNacimiento de tipo Date 
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * 
	 * @param fechaNacimiento de tipo Date que establece el valor del atibuto fechaNacimiento
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}
