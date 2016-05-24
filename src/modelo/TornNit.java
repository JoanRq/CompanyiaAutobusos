package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by joan on 17/05/2016.
 */
public class TornNit extends Torn {

  // Atributs

  // normalitzacio
  private ArrayList<Incidencia> incidencias;


  public TornNit(Conductor conductor, LocalDate fecha,
                    TipusTorn tipoTurno, Autobus bus) throws Exception{
    super (conductor, fecha, tipoTurno, bus );

    if (tipoTurno != TipusTorn.NIT) {
      throw new Exception();
    }
    incidencias = new ArrayList<Incidencia>();
  }

  public void addIncidencia(Incidencia problema) throws Exception{
    if (problema==null){
      throw new Exception();
    }

    incidencias.add(problema);

  }
}



