
package backEnd;

public class Arbitro {
  private int idArbitro;
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String telefono;
  private boolean disponible;

  public Arbitro(String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, boolean disponible) {
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.telefono = telefono;
    this.disponible = disponible;
  }

  public int getIdArbitro() {
    return idArbitro;
  }

  public void setIdArbitro(int idArbitro) {
    this.idArbitro = idArbitro;
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

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public boolean isDisponible() {
    return disponible;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

}