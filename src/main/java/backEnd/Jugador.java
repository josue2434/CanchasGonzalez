
package backEnd;

public class Jugador {

  // ATRIBUTOS
  private int idJugador;
  private int idEquipo;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private int numeroCamiseta;
  private String posicion;
  private String fechaNacimiento;

  // CONSTRUCTORES

  public Jugador() {
  }

  public Jugador(int idEquipo, String nombre, String apellidoPaterno, String apellidoMaterno, int numeroCamiseta,
      String posicion, String fechaNacimiento) {

    this.idEquipo = idEquipo;
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.numeroCamiseta = numeroCamiseta;
    this.posicion = posicion;
    this.fechaNacimiento = fechaNacimiento;

  }

  public int getIdJugador() {
    return idJugador;
  }

  public void setIdJugador(int idJugador) {
    this.idJugador = idJugador;
  }

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

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public int getNumeroCamiseta() {
    return numeroCamiseta;
  }

  public void setNumeroCamiseta(int numeroCamiseta) {
    this.numeroCamiseta = numeroCamiseta;
  }

  public String getPosicion() {
    return posicion;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public String toString(){
    return "Jugador [idEquipo=" + idEquipo + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", numeroCamiseta=" + numeroCamiseta + ", posicion=" + posicion + ", fechaNacimiento=" + fechaNacimiento + "]";
  }

  
}

