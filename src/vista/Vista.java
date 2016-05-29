package vista;

import controlador.Controlador;

import java.util.Scanner;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Vista {
  private Controlador controlador = new Controlador();
  private Scanner entrada;

  public Vista() {
    this.entrada = new Scanner(System.in);
  }

  public void altaParada() {
    boolean var1 = true;
    while (var1) {
      System.out.println("Parada: "+this.controlador.llistaParades.keySet());

      System.out.print("Nom de Parada (INTRO per sortir) : ");
      String var2 = this.entrada.nextLine().trim();
      if (var2.length()==0){
        var1=false;
      }
      else {
        try {
          this.controlador.addParada(var2);
        }
        catch (Exception error ) {
          System.err.println("Paràmetres incorrectes");
        }
      }
    }
  }


  public void altaParadaEnLinea() {

    boolean var1 = true;
    while (var1) {
      System.out.println("ParadaEnLinea: "+this.controlador.llistaParadesEnLinea.keySet());

      System.out.print("Introduïu ParadaEnLinea (INTRO per sortir)    : ");
      String var2 = this.entrada.nextLine().trim();

      System.out.print("Introduïu Linea deParadaEnLinea (0 per SORTIR : ");
      int var3 = Integer.parseInt("0"+this.entrada.nextLine().trim());

      if (var2.length()==0 || var3 == 0){
        var1=false;
      }
      try {
        this.controlador.addParadaEnLinea(var2, var3);

      } catch (Exception error ) {
        System.err.println("Paràmetres incorrectes");
      }
    }
  }

  public void altaLinies() {
    boolean var1 = true;
    while (var1) {
      System.out.print("Introduïu numero de Linia (0 per Sortir : ");
      int var2 = Integer.parseInt("0"+this.entrada.nextLine().trim());
      if (var2==0 ) {
        var1 = false;
      }
      else {
        try {
          this.controlador.addLinia(var2);
        } catch (Exception error ) {
          System.err.println("Paràmetres incorrectes");
        }
      }
    }
  }

  public void altaConductor() {
    boolean var1 = true;
    while (var1) {
      System.out.println("\nLinia: " + this.controlador.conductors.keySet());
      System.out.print("Introduce un nombre del Conductor (Intro per sortir) : ");
      String var2 = this.entrada.nextLine();
      System.out.print("Introduce su DNI                  (Intro per sortir) : ");
      String var3 = this.entrada.nextLine();
      if(var2.length() == 0 || var3.length() == 0 ) {
        var1 = false;
      }
      else {
        try {
          this.controlador.addConductor(var3, var2);
        } catch (Exception var5) {
          System.err.println("Los parametros no son correctos");
        }
      }
    }
  }
  public void altaCondVetera() {
    boolean var1 = true;
    while (var1) {
      try {
        System.out.print("\nIntroduïu el nom del Conductor  : ");
        String var2 = this.entrada.nextLine();
        System.out.print("Introduïu DNI                   : ");
        String var3 = this.entrada.nextLine();
        System.out.print("Introduïu numero de Linia Vetada: ");
        int var4 = Integer.parseInt(this.entrada.nextLine());

        this.controlador.addCondVetera(var2, var3, var4);
        var1 = false;
      } catch (Exception var5) {
        System.err.println("Los parametros no son correctos");
      }
    }
  }
  public void altaCondAprenent() {
    boolean var1 = true;
    while (var1) {
      try {
        System.out.print("\nIntroduïu el nom del Conductor  : ");
        String var2 = this.entrada.nextLine();
        System.out.print("Introduïu DNI                   : ");
        String var3 = this.entrada.nextLine();

        this.controlador.addCondAprenent(var3, var2);
        var1 = false;
      } catch (Exception var5) {
        System.err.println("Los parametros no son correctos");
      }
    }
  }

  public void Menu() {
    while (true) {
      try {
        System.out.println();
        System.out.println("1. Alta Conductors");
        System.out.println("2. Creació Linies");
        System.out.println("3. Creació de Parades (sense afegir ParadeEnLinea");
        System.out.println("4. Alta de ParadaEnLinea");
        System.out.println("10. Alta Conductor ConductorVetera");
        System.out.println("20. Alta Conductors ConductorAprenent");
        System.out.println("0. Salir");
        System.out.println();
        System.out.print("Introduce una opcion: ");
        int var1 = Integer.parseInt(this.entrada.nextLine());
        switch (var1) {
          case 1:
            this.altaConductor();
            break;
          case 2:
            this.altaLinies();
            break;
          case 3:
            this.altaParada();
            break;
          case 4:
            this.altaParadaEnLinea();
            break;
          case 10:
            this.altaCondVetera();
            break;
          case 20:
            this.altaCondAprenent();
            break;

          case 0:
            return;
          default:
            System.err.println("Opcion no valida\n");
        }
      } catch (Exception var2) {
        System.err.print("Introduce un numero\n");
      }
    }
  }


  public static void main(String[] args) {
    Vista vis = new Vista();
    vis.Menu();
  }
}
