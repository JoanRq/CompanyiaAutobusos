package modelo;

import java.time.LocalDate;


/**
 * Created by joan on 17/05/2016.
 */
public class Incidencia {
  private int codi;
  private String nom;
  private LocalDate data;
  private TornNit tNit;



  public Incidencia(int codi, String nom, LocalDate data, TornNit tNnit)
      throws Exception {
    if (nom == null || data == null || tNit == null) {
      throw new Exception();
    }
    this.codi = codi;
    this.nom = nom;
    this.data = data;
    this.tNit = tNnit;
  }
}
