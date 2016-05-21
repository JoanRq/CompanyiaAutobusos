package controlador;

import modelo.Conductor;
import modelo.Linia;
import modelo.Parada;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class GestioBus {

  private HashMap<String, Conductor> conductors = new HashMap();
  private HashMap<Integer, Linia> numLinines = new HashMap();
  private HashMap<String, Parada> nomParades = new HashMap();


  public void addConductor(String dni, String nombre) {
    this.conductors.put(dni, new Conductor(dni, nombre));
  }

  public void addLinia(int numLinina) throws Exception {

/***
 *  put(K key, V value)
 *    Si ja existeix, retorna el valor antic de la clau.
 *    (null si no existia o si Value estava associat a null)
 *  putIfAbsent(K key, V value)
 *    Si ja existeix o si el Value associat a Key estava associat a null
 *    retornarà null, si no retornara Value
 */

    if (this.numLinines.putIfAbsent(numLinina, new Linia(numLinina)) != null) {
      // si no es null vol dir que ja el tenim per tant es un error
      throw new Exception();
    }
  }

  public void addParada(String nomParada,int numLinina) throws Exception {
    // si es un numero vàlid afegeix la parada
    Linia novaLinea;
    if ((novaLinea=this.numLinines.get(numLinina)) == null) {
      throw new Exception();
    }
    this.nomParades.put(nomParada, new Parada(nomParada,novaLinea));
  }

}
