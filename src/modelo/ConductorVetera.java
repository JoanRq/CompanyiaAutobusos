package modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ConductorVetera extends Conductor {

  private Linia noLinia;

  public ConductorVetera(String dni, String nom) throws Exception {
    super(dni, nom);

  }

  public void setNoLinea(Linia noLinia) throws Exception {
    if (noLinia == null) {
      throw new Exception();
    }

    this.noLinia = noLinia;
  }
}
