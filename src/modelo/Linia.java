package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linia {
  // Atributs
  private int numLinia;

  //normalizacion UML
  private ArrayList<Assignades> assignacions;
  private ArrayList<ConductorVetera> conductorsVeterans;
  private ArrayList<Autobus> autobusos;
  private ArrayList<ParadaEnLinia> parades;

  public Linia(int numLinia) throws Exception {
    if (numLinia < 0 ) {
      throw new Exception();
    }

    this.numLinia = numLinia;

    assignacions = new ArrayList<>();
    conductorsVeterans = new ArrayList<>();
    autobusos = new ArrayList<>();
    parades = new ArrayList<>();
  }

  public void addAutobus(Autobus bus)
      throws Exception{
    if (bus == null) {
      throw new Exception();
    }
    this.autobusos.add(bus);
  }
  public int getNumLinia(){
    return numLinia;
  }

}