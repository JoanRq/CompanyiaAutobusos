package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class AutoBus {
  // Atributs
  private String matricula;
  private int places;

  // Resultat normalitzacio
  private Linia linia;
  private ArrayList<Torn> busTorns;

  public AutoBus(String matricula, int places, Linia linia) throws Exception {
    if (matricula == null || linia == null || places < 0) {
      throw new Exception();
    }
    this.matricula = matricula;
    this.places = places;
    this.linia = linia;

    busTorns = new ArrayList<>();
  }

  public void addTorn(Torn torn) throws Exception {
    if (torn == null) {
      throw new Exception();
    }
    busTorns.add(torn);
  }
}