package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Conductor {
  private String dni;
  private String nom;

  private ArrayList<BusTorn> busTorn;

  public Conductor(String dni, String nom) throws Exception {
    if (dni == null || nom == null) {
      throw new Exception();
    }

    this.dni = dni;
    this.nom = nom;

    busTorn = new ArrayList<>();
  }

  public String getNom() {
    return nom;
  }

  @Override
  public String toString() {
    return "Nombre: " + this.nom + ", DNI: " + this.dni;
  }
}


