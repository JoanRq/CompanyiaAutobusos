package modelo;

/**
 * Created by poo2 on 24/05/2016.
 */
public class Assignades {
  private float hores;

  private ConductorAprenent practicas;
  private Linia lineas;

  public Assignades(float horas, ConductorAprenent conductorPracticas,
                   Linia linea) throws Exception {
    if ( conductorPracticas == null || linea == null){
      throw new NullPointerException();
    }
    if (horas <= 100){
      throw new Exception();
    }
    this.hores = horas;
    this.practicas = conductorPracticas;
    this.lineas = linea;
  }

}
