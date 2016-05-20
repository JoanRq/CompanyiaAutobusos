package controlador;

import modelo.Conductor;
import modelo.Linia;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class GestioBus {

  private HashMap<String, Conductor> conductors = new HashMap();
  private HashMap<Integer, Linia> numLinines = new HashMap();


  public void addConductor(String dni, String nombre) {
    this.conductors.put(dni, new Conductor(dni, nombre));
  }

  public void addLinia(int numLinina) throws Exception {

/***
 *  Returns:
 *  the previous value associated with key, or null if there was no mapping for key.
 *  (A null return can also indicate that the map previously associated null with key.)
 */
    try {
      this.numLinines.put(numLinina, new Linia(numLinina)).getNumLinea();
     //int var = this.numLinines.put(numLinina, new Linia(numLinina)).getNumLinea();
    } catch (Exception NullPointerException ) {
      return;
    }
    throw new Exception();
  }
}
