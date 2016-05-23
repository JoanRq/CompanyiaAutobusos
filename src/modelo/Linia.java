package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linia {
  private int numLinina;


  //normalizacion UML
  ArrayList<Parada> parades;
  ArrayList<ConductorVetera> veterans;
  ArrayList<ConductorAprenent> practiques;
  ArrayList<Bus> autobusos;


  public Linia(int numLinina) {
    this.numLinina = numLinina;

    autobusos  = new ArrayList<>();
    practiques = new ArrayList<>();
    veterans   = new ArrayList<>();
    autobusos  = new ArrayList<>();

  }


  public int getNumLinia() {
    return  numLinina ;
  }

/*
  public Linia getLinina(int numLinea) {
    return this.get();
  }
*/

}
