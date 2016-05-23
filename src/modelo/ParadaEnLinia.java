package modelo;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ParadaEnLinia {

  private Linia linia;
  private Parada parada;
  private ParadaEnLinia anterior;
  private ParadaEnLinia posterior;

  public ParadaEnLinia(Linia linia, Parada parada) throws Exception {
    if (parada == null || linia == null) {
      throw new Exception();
    }

    this.linia= linia;
    this.parada= parada;

  }

  public void setAnterior(ParadaEnLinia anterior) throws Exception {
    if (anterior == null || anterior.linia != this.linia || anterior == this) {
      throw new Exception();
    }

    this.anterior = anterior;
  }

  public void setPosterior(ParadaEnLinia posterior) throws Exception {
    if (posterior == null || posterior.linia != this.linia || posterior == this) {
      throw new Exception();
    }

    this.posterior = posterior;
  }
}
