package backEnd;


public class Equipo {
  // atributos
  private int idEquipo;
  private String nombre;
  private String telefono;

  // constructores
  public Equipo() {

  }

  public Equipo(String nombre, String telefono) {
    this.nombre = nombre;
    this.telefono = telefono;

  }

  // getters y setters
  public int getIdEquipo() {
    return idEquipo;
  }

  public void setIdEquipo(int idEquipo) {
    this.idEquipo = idEquipo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  // metodos
  public String toString() {
    return "Equipo: " + nombre + ", " + telefono;
  }

}