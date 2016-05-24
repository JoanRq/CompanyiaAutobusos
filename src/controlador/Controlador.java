package controlador;

import modelo.*;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Controlador {

  public HashMap<String, Conductor> conductors = new HashMap();
  public HashMap<String, ConductorVetera> conductorsVeterans = new HashMap();
  public HashMap<String, ConductorAprenent> conductorsAprenents = new HashMap();
  public HashMap<Integer, Linia> numLinines = new HashMap();
  public HashMap<String, ParadaEnLinia> llistaParadesEnLinea = new HashMap();
  public HashMap<String, Parada> llistaParades = new HashMap();
  public HashMap<String, Autobus> llistaAutobusos = new HashMap();


  public void addAutoBus(String matricula, int places, int numLinia)
      throws Exception {
    Linia linia = this.numLinines.get(numLinia);
    if (linia == null ){
      throw new Exception();
    }
    Autobus b1 = this.llistaAutobusos.get(matricula);
    if (b1 != null ) {
      throw new Exception();
    }
    this.llistaAutobusos.put(matricula, new Autobus(matricula,places,linia));
  }

  public void addConductor(String dni, String nombre) throws Exception {
    Conductor resultat = this.conductors.putIfAbsent(dni, new Conductor(dni, nombre));
    if (resultat!=null){
      System.out.println("Conductor DUPLICAT!!!");
    }

  }

  public void addCondVetera(String dni, String nombre, int LiniaVetada) throws Exception {
    Linia lVetada = this.numLinines.get(LiniaVetada);
    // creem objecte Conductor Vetera
    ConductorVetera cVetera = new ConductorVetera(dni, nombre);
    // li afegeixo la Linia Vetada (o noLinia)
    cVetera.setNoLinea(lVetada);
    this.conductorsVeterans.put(dni, cVetera);

  }

  public void addCondAprenent(String dni, String nombre) throws Exception {
    this.conductorsAprenents.put(dni, new ConductorAprenent(dni, nombre));
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

  public void addParada(String nomParada) throws Exception {
    // si es un numero vàlid afegeix la parada
    Parada resultat = this.llistaParades.putIfAbsent(nomParada, new Parada(nomParada));
    if (resultat!=null){
      System.out.println("La parada ja existeix i no s'ha modificat!!!");
    }

  }

  public void addLiniaDeParada(String nomParada,int numLinia) throws Exception {
    Parada parada= llistaParades.get(nomParada);
    Linia lina= numLinines.get(numLinia);
    parada.addLiniaDeParada(lina);
    System.out.println("Afegida linia: "+numLinia+" a la "+parada.toString());
  }

  public void addParadaEnLinea(String nomParada,int numLinina) throws Exception {

    Parada parada;
    Linia lParadaEnLinea;
    try {
      parada = this.llistaParades.get(nomParada);
      lParadaEnLinea= this.numLinines.get(numLinina);
    }
    catch (Exception error) {
      throw new Exception();
    }

    ParadaEnLinia pParadaEnLinia = new ParadaEnLinia(lParadaEnLinea, parada);
    ParadaEnLinia resultat = this.llistaParadesEnLinea.put(nomParada+"|"+numLinina, pParadaEnLinia);
    if (resultat != null ){
      System.out.println("ParadaEnLinea ja existeix i no s'ha modificat!!!");
    }
  }
}
