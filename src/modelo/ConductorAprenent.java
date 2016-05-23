package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ConductorAprenent extends Conductor {
  // caldra evitar assignar linies en horari Nocturn

  // segons la normalitzacio UML
  private ArrayList<Linia> lineaAssignada;

  public ConductorAprenent(String dni, String nom) throws Exception{
    super(dni, nom);

    lineaAssignada = new ArrayList<>();
  }
}
