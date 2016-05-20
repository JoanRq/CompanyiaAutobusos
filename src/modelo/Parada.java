package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Parada {
  private String nomParada;

  // Normalitzacio model
  private ArrayList<Linia> linies;

  public Parada(String nomParada) {
    this.nomParada=nomParada;

    linies = new ArrayList<>();

  }

  public void addLiniesDeLaParada(Linia linia){


  }


}
