package modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Vetera extends Conductor {
  private Linia lineaVetada;


  public Vetera(String dni, String nom, Linia lineaVetada) {
    super(dni, nom);
    this.lineaVetada = lineaVetada;

  }
}
