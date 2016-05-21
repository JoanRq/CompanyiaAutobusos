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

  public void altaParadesd() {
    boolean var1 = true;
    while (var1) {
      try {

        System.out.print("Introduïu un nom de Parada nou            : ");
        String var2 = this.entrada.nextLine().trim();

        System.out.print("Introduïu un numero de Linea de la Parada : ");
        int var3 = Integer.parseInt(this.entrada.nextLine().trim());
        this.gestioBus.addParada(var2, var3);

        int var4 = -1;
        while (var4!=0) {
          try {
            System.out.print("Introduiu un altre numero de línea (0 per finalitzar) : ");
            var4 = Integer.parseInt(this.entrada.nextLine().trim());
            //this.gestioBus.addLiniaDeParada(var2, var4);

          } catch (Exception error){
            System.err.println("Paràmetres incorrectes");
          }

        }


        var1 = false;
      } catch (Exception error ) {
        System.err.println("Paràmetres incorrectes");
      }
    }
  }

  public void altaLinies() {
    boolean var1 = true;
    while (var1) {
      try {
        System.out.print("Introduïu numero de Linia : ");
        int var2 = Integer.parseInt(this.entrada.nextLine());
        this.gestioBus.addLinia(var2);
        var1 = false;
      } catch (Exception error ) {
        System.err.println("Paràmetres incorrectes");
      }
    }
  }

  public void pedirConductor() {
    boolean var1 = true;
    while (var1) {
      try {
        System.out.print("\nIntroduce un nombre del Conductor: ");
        String var2 = this.entrada.nextLine();
        System.out.print("Introduce su DNI: ");
        String var3 = this.entrada.nextLine();
        this.gestioBus.addConductor(var2, var3);
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
        System.out.println("2. Alta de Linies");
        System.out.println("3. Alta de Parades");
        System.out.println("0. Salir");
        System.out.println();
        System.out.print("Introduce una opcion: ");
        int var1 = Integer.parseInt(this.entrada.nextLine());
        switch (var1) {
          case 1:
            this.pedirConductor();
            break;
          case 2:
            this.altaLinies();
            break;
          case 3:
            this.altaLinies();
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
