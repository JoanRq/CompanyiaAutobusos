package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Linia {
  // Atributs
  private int numLinina;

  //normalizacion UML
  private ArrayList<Assignades> assignacions;
  private ArrayList<ConductorVetera> conductorsVeterans;
  private ArrayList<Autobus> autobusos;
  private ArrayList<ParadaEnLinia> parades;

  public Linia(int numLinina) throws Exception {
    if (numLinina < 0 ) {
      throw new Exception();
    }

    this.numLinina = numLinina;

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

}