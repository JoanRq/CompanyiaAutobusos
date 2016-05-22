package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Vetera extends Conductor {
  private Linia lineaVetada;

  // segons la normalitzacio UML
  private ArrayList<Linia> lineaAssignada;

  public Vetera(String dni, String nom, Linia lineaVetada) throws Exception {
    super(dni, nom);

    this.lineaVetada = lineaVetada;

  }
}
