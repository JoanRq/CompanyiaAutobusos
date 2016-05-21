package modelo;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Parada {
  private String nomParada;

  // Normalitzacio model
  /***
   * linies hauria de ser un HashMap per evitar duplicitats o be
   * evitar-les aqui mateix
   */

  private HashMap<Integer, Linia> linies ;

  /***
   * Segons l'enunciat, La parada de una Linea te que tenir com a minim una
   * parada anterior i una altra de posterior (i totes tres han de pertanyer
   * a la mateixa linia.
   * es consideressin tant les parades que s'estan desmuntant com les que es creen
   *  tambe podriem considerar ParadaEnLinea com una subclasse de Parada
   *
   * @param nomParada
   * @param liniesParada
   */
  public Parada(String nomParada,Linia liniesParada) {
    this.nomParada=nomParada;

    linies = new HashMap();
    this.linies.put(liniesParada.getNumLinea(), liniesParada);
  }

  public void addLiniaDeParada(Linia liniaDeParada){
    this.linies.put(liniaDeParada.getNumLinea(), liniaDeParada);
  }

  public HashMap<Integer, Linia> getLiniesDeParada(){
    return linies;
  }

  public boolean esParadaDeLinea(Linia liniaEnQuestio ) {
    return false;
  }
}
