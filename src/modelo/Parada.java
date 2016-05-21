package modelo;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Parada {
  private String nomParada;

  // Normalitzacio model
  /***
   * linies hauria de ser un HashMap per evitar duplicitats... o evitarles
   */

  private HashMap<Integer, Linia> linies;

  public Parada(String nomParada,int... numLiniesParada) {
    this.nomParada=nomParada;

    linies = new = new HashMap();

  }

  public void addLiniesParada(Linia... liniesParada){



  }


}
