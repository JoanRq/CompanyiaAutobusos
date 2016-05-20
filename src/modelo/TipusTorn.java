package modelo;

import java.util.ArrayList;

/**
 * Created by joan on 17/05/2016.
 */
public class TipusTorn {
  private ArrayList<BusTorn> busTorns;

  public TipusTorn() {
    busTorns = new ArrayList<>();
  }

  public enum Torns {MATI,TARDA,NIT}

}
