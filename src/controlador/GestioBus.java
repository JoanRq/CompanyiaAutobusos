package controlador;

import modelo.*;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class GestioBus {

  private HashMap<String, Conductor> conductors               = new HashMap();
  private HashMap<String, ConductorVetera> conductorsVeterans               = new HashMap();
  private HashMap<String, ConductorAprenent> conductorsAprenents               = new HashMap();
  private HashMap<Integer, Linia> numLinines                  = new HashMap();
  private HashMap<String, ParadaEnLinia>llistaParadesEnLinea  = new HashMap();
  private HashMap<String, Parada>llistaParades                = new HashMap();


  public void addConductor(String dni, String nombre) throws Exception {
    this.conductors.put(dni, new Conductor(dni, nombre));
  }

  public void addCondVetera(String dni, String nombre, int LiniaVetada) throws Exception {
    Linia lVetada = this.numLinines.get(LiniaVetada);
    this.conductorsVeterans.put(dni, new ConductorVetera(dni, nombre, lVetada));
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

  public void addParada(String nomParada,int numLinina) throws Exception {
    // si es un numero vàlid afegeix la parada
    Linia novaLinea;
    if ((novaLinea= this.numLinines.get(numLinina)) == null) {
      throw new Exception();
    }
    Parada resultat = this.llistaParades.putIfAbsent(nomParada, new Parada(nomParada,novaLinea));
    if (resultat==null){
      resultat = this.llistaParades.get(nomParada);
      System.out.println("La parada s'ha afegit correctament :\n"+
          resultat.toString());
    }
    else {
      System.out.println("La parada ja existeix i no s'ha modificat!!! :\n"+
          resultat.toString());
    }

  }

  public void addLiniaDeParada(String nomParada,int numLinia) throws Exception {
    Parada parada= llistaParades.get(nomParada);
    Linia lina= numLinines.get(numLinia);
    parada.addLiniaDeParada(lina);
    System.out.println("Afegida linia: "+numLinia+" a la "+parada.toString());
  }

  /***
   * addParadaEnLinea crida el Constructor de ParadaEnLinea
   *     fem el minim de comprovacions per assegurar que estem envian el que cal
   *     les comprovacions ja es faran al Constructor
   *
   * @param nomParada
   * @param numLinina
   * @param paradaAnterior
   * @param paradaPosterior
   * @throws Exception
   *
   */
  public void addParadaEnLinea(String nomParada,int numLinina, String paradaAnterior,
      String paradaPosterior) throws Exception {

    Parada parada, pa, pp;
    Linia lParadaEnLinea;
    try {
      parada = this.llistaParades.get(nomParada);
      lParadaEnLinea= this.numLinines.get(numLinina);
      pa= this.llistaParades.get(paradaAnterior);
      pp= this.llistaParades.get(paradaPosterior);
    }
    catch (Exception error) {
      throw new Exception();
    }

    ParadaEnLinia pParadaEnLinia = new ParadaEnLinia(parada, lParadaEnLinea, pa, pp);
    this.llistaParadesEnLinea.put(nomParada, pParadaEnLinia);

  }

}
