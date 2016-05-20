package controlador;

import modelo.Conductor;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class GestioBus {

  private HashMap<String, Conductor> conductors = new HashMap();


  public void addConductor(String dni, String nombre) {
    this.conductors.put(dni, new Conductor(dni, nombre));
  }

}
