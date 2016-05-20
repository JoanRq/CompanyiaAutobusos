package modelo;

/**
 * Created by joan on 20/05/2016.
 */
public class BusTorn {
  private Conductor conductor;
  private Fecha fecha;
  private TipusTorn tipusTorn;

  public BusTorn(Conductor conductor, Fecha fecha, TipusTorn tipusTorn, Bus busos) {
    this.conductor = conductor;
    this.fecha = fecha;
    this.tipusTorn = tipusTorn;
  }
}
