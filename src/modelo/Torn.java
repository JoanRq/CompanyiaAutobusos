package modelo;

import java.time.LocalDate;

/**
 * Created by joan on 20/05/2016.
 */
public class Torn {

  // Atributs
  private Conductor conductor;
  private LocalDate data;
  private TipusTorn tipusTorn;
  private Autobus bus;

  // Constructor
  public Torn(Conductor conductor, LocalDate data, TipusTorn tipusTorn, Autobus bus)
      throws Exception {
    if (conductor == null || data == null || tipusTorn == null || bus  == null) {
      throw new Exception();
    }

    this.conductor = conductor;
    this.data = data;
    this.tipusTorn = tipusTorn;
    this.bus = bus;
  }
}
