package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ConductorAprenent extends Conductor {
  // segons la normalitzacio UML
  private ArrayList<Assignades> linies;

  public ConductorAprenent(String dni, String nom) throws Exception{
    super(dni, nom);

    linies = new ArrayList<>();
  }

  public void addAsignacion(Assignades linia) throws Exception{
    if(linia == null || linies.size() >= 4){
      throw new Exception();
    }
    linies.add(linia);
  }
}
