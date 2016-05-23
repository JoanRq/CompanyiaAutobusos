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

  public Linia(int numLinina) {
    this.numLinina = numLinina;

    assignacions = new ArrayList<>();
    conductorsVeterans = new ArrayList<>();
    autobusos = new ArrayList<>();
    parades = new ArrayList<>();
  }
}