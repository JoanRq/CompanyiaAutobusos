package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Bus {
  // Atributs
  private String matricula;
  private int numPlaces;

  // Resultat normalitzacio
  private Linia linea;
  private ArrayList<BusTorn> busTorns;

  // Metodes
  public Bus(String matricula, int numPlaces, Linia linea) throws Exception {
    if (matricula == null || linea == null || numPlaces < 0) {
      throw new Exception();
    }
    this.matricula = matricula;
    this.numPlaces = numPlaces;
    this.linea = linea;
    busTorns = new ArrayList<>();

  }
/*
  public void addBusTorn(Torn jornada) throws Exception {
    if (jornada == null) {
      throw new Exception();
    }
    busTorns.add(jornada);
  }
*/

}
