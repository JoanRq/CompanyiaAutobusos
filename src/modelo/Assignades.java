package modelo;

/**
 * Created by joan on 17/05/2016.
 */
public class Assignades {
  private float hores;

  private ConductorAprenent practicas;
  private Linia lineas;

  public Assignades(float horas, ConductorAprenent conductorAprenent,
      Linia linea) throws Exception {

    if ( conductorAprenent == null || linea == null){
      throw new NullPointerException();
    }

    if (horas <= 100) {
      throw new Exception();
    }
    this.hores = horas;
    this.practicas = conductorAprenent;
    this.lineas = linea;
  }
}
