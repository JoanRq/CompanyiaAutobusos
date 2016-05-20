package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linia {
  private int numLinina;


  //normalizacion UML
  ArrayList<Parada> parades;
  ArrayList<Vetera> veterans;
  ArrayList<Practiques> practiques;
  ArrayList<Bus> autobusos;


  public Linia() {

  }

  public Linia(int numLinina) {
    this.numLinina = numLinina;

    autobusos  = new ArrayList<>();
    practiques = new ArrayList<>();
    veterans   = new ArrayList<>();
    autobusos  = new ArrayList<>();

  }

  public int getNumLinea() {
    return  numLinina ;
  }
}
