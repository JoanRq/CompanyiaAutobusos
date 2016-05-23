package modelo;

import java.util.ArrayList;

public class Parada {
  protected String nomParada;

  protected ArrayList<ParadaEnLinia> paradesLinies;


  public Parada(String nomParada) {
    this.nomParada = nomParada;

    this.paradesLinies = new ArrayList();
  }

  public void addParada(ParadaEnLinia posParada)
      throws Exception {
    if (posParada == null) {
      throw new Exception();
    }
    paradesLinies.add(posParada);
  }

  public void addLiniaDeParada(Linia lina) {

  }
}