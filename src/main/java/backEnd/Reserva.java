package backEnd;

public class Reserva {

  // Atributos
  private int idReserva;
  private int idEquipoLocal;
  private int idEquipoVisitante;
  private int idArbitro;
  private String fechaReserva;
  private int numeroCancha;
  private String horario;
  private boolean disponible;

  // Constructores

  public Reserva() {

  }

  public Reserva(int idEquipoLocal, int idEquipoVisitante, int idArbitro, String fechaReserva, int numeroCancha,
      String horario, boolean disponible) {
    this.idEquipoLocal = idEquipoLocal;
    this.idEquipoVisitante = idEquipoVisitante;
    this.idArbitro = idArbitro;
    this.fechaReserva = fechaReserva;
    this.numeroCancha = numeroCancha;
    this.horario = horario;
    this.disponible = disponible;
  }

  public int getIdReserva() {
    return idReserva;
  }

  public void setIdReserva(int idReserva) {
    this.idReserva = idReserva;
  }

  public int getIdEquipoLocal() {
    return idEquipoLocal;
  }

  public void setIdEquipoLocal(int idEquipoLocal) {
    this.idEquipoLocal = idEquipoLocal;
  }

  public int getIdEquipoVisitante() {
    return idEquipoVisitante;
  }

  public void setIdEquipoVisitante(int idEquipoVisitante) {
    this.idEquipoVisitante = idEquipoVisitante;
  }

  public int getIdArbitro() {
    return idArbitro;
  }

  public void setIdArbitro(int idArbitro) {
    this.idArbitro = idArbitro;
  }

  public String getFechaReserva() {
    return fechaReserva;
  }

  public void setFechaReserva(String fechaReserva) {
    this.fechaReserva = fechaReserva;
  }

  public int getNumeroCancha() {
    return numeroCancha;
  }

  public void setNumeroCancha(int numeroCancha) {
    this.numeroCancha = numeroCancha;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }

  public boolean isDisponible() {
    return disponible;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  public String toString() {
    return "IdReserva: " + idReserva + "\n" + "IdEquipoLocal: " + idEquipoLocal + "\n" + "IdEquipoVisitante: "
        + idEquipoVisitante + "\n" + "IdArbitro: " + idArbitro + "\n" + "FechaReserva: " + fechaReserva + "\n"
        + "NumeroCancha: " + numeroCancha + "\n" + "Horario: " + horario + "\n" + "Disponible: " + disponible;
  }

}