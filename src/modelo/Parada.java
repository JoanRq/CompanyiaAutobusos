package modelo;

import java.util.HashMap;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Parada {

  protected String nomParada;

  // Normalitzacio model
  /***
   * linies hauria de ser un HashMap per evitar duplicitats o be
   * evitar-les aqui mateix
   */
  protected HashMap<Integer, Linia> liniesParada ;

  /***
   * Segons l'enunciat, La parada de una Linea te que tenir com a minim una
   * parada anterior i una altra de posterior (i totes tres han de pertanyer
   * a la mateixa linia.
   * es consideressin tant les parades que s'estan desmuntant com les que es creen
   *  tambe podriem considerar ParadaEnLinea com una subclasse de Parada
   *
   * @param nomParada
   * @param liniaParada
   */

  public Parada(String nomParada,Linia liniaParada) {
    this.nomParada=nomParada;

    this.liniesParada = new HashMap();
    this.liniesParada.put(liniaParada.getNumLinia(), liniaParada);

  }
  public String getNomParada(){
    return this.nomParada;
  }

  public boolean esParadaDeLinea(Linia unaLinea) {
    if (this.liniesParada.get(unaLinea.getNumLinia())!=null)
      return true;
    return false;
  }


  public void addLiniaDeParada(Linia liniaParada){
    this.liniesParada.put(liniaParada.getNumLinia(), liniaParada);
  }

  @Override
  public String toString() {
    String strTmp ="{";
    for (int i : this.liniesParada.keySet() )
      strTmp +=i+"},{";
    strTmp = strTmp.substring(0, strTmp.length()-2);


  return "Parada{" +
  "nomParada='" + this.nomParada + '\'' +
  ", liniesParada=" + strTmp +
  '}';
}
}
