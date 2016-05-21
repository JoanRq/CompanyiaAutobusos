package modelo;

import java.util.ArrayList;

/**
 * Created by poo2 on 17/05/2016.
 */
public class ParadaEnLinia extends Parada {

  // Normalitzacio model

  private Parada nomParada;
  private Parada paradaAnterior;
  private Parada paradaPosterior;

  private ArrayList<Linia>  linies;
  private ArrayList<Parada> parades;

  /***
   * Abans d'afegir nomParada a l'array de parades
   * caldrà mirar si paradaAnetrior i paradaPosterior són de la linia
   *
   * @param nomParada
   * @param liniesParada
   */
  public ParadaEnLinia(String nomParada,Linia liniesParada, Parada paradaAnterior,
                       Parada paradaPosterior) {


    super(nomParada, liniesParada);



  }
}
