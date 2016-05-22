package modelo;

import modelo.Parada;
import modelo.Linia;


import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ParadaEnLinia {

  // Normalitzacio model

  private Parada parada;
  private Parada paradaAnterior;
  private Parada paradaPosterior;

  private HashMap<Integer, Linia> liniesParada ;
  private HashMap<String, Parada> llistaParadesEnLinia ;
  /***
   * Abans d'afegir nomParada a l'array de parades
   * caldrà mirar si paradaAnetrior i paradaPosterior són de la linia
   *
   * @param parada
   * @param lParada
   * @param pAnterior
   * @param pPosterior
   */

  public ParadaEnLinia(Parada parada,Linia lParada, Parada pAnterior, Parada pPosterior)
      throws Exception {

    if (parada == null || lParada == null) {
      throw new Exception();
    }
    if ( pAnterior == null && pPosterior == null ) {
      throw new Exception();
    }

    if ( !( pAnterior.esParadaDeLinea(lParada) || pPosterior.esParadaDeLinea(lParada) ) ) {
      throw new Exception();
    }

    this.parada= parada;
    this.paradaAnterior= pAnterior;
    this.paradaPosterior= pPosterior;

    this.llistaParadesEnLinia= new HashMap();
    this.llistaParadesEnLinia.put(parada.getNomParada(),parada);

    this.liniesParada= new HashMap();
    this.liniesParada.put(lParada.getNumLinia(),lParada);

  }


  @Override
  public String toString() {
    String strTmp ="{";
    for (int i : this.liniesParada.keySet() )
      strTmp +=i+"},{";
    strTmp = strTmp.substring(0, strTmp.length()-2);

    return "ParadaEnLinea{" +
        "nomParada='" + this.parada.getNomParada() + '\'' +
        ", liniesParada=" + strTmp +
        '}';
  }





}
