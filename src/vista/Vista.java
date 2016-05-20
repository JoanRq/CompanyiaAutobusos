package vista;

import controlador.GestioBus;

import java.util.Scanner;

/**
 * Created by poo2 on 17/05/2016.
 */
public class Vista {
  private GestioBus gestioBus = new GestioBus();
  private Scanner entrada;

  public Vista() {
    this.entrada = new Scanner(System.in);
  }

  public void pedirConductor() {
    boolean var1 = true;
    while (var1) {
      try {
        System.out.print("Introduce un nombre del Conductor: ");
        String var2 = this.entrada.nextLine();
        System.out.print("Introduce su DNI: ");
        String var3 = this.entrada.nextLine();
        this.gestioBus.addConductor(var2, var3);
        var1 = false;
      } catch (Exception var5) {
        System.err.println("Los parametros no son correctos\n");
      }
    }
  }

  public void Menu() {
    while (true) {
      try {
        System.out.println();
        System.out.println("1. Dar de Conductores");
        System.out.println("2. Salir");
        System.out.println();
        System.out.print("Introduce una opcion: ");
        int var1 = Integer.parseInt(this.entrada.nextLine());
        switch (var1) {
          case 1:
            this.pedirConductor();
            break;
          case 2:
            return;
          default:
            System.err.println("Opcion no valida\n");
        }
      } catch (Exception var2) {
        System.err.println("Introduce un numero\n");
      }
    }
  }


  public static void main(String[] args) {
    Vista vis = new Vista();
    vis.Menu();
  }
}
