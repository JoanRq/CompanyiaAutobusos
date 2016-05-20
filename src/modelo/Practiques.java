package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Practiques extends Conductor {

// segons la normalitzacio UML
  private ArrayList<Linia> lineaAssignada;

  public Practiques(String dni, String nom) {
    super(dni, nom);

    lineaAssignada = new ArrayList<>();
  }
}
