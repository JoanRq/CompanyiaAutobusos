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

  public void altaParada() {
    boolean var1 = true;
    while (var1) {
      try {
        System.out.print("Introduïu un nom de Parada nova           : ");
        String var2 = this.entrada.nextLine().trim();

        System.out.print("Introduïu un numero de Linea de la Parada : ");
        int var3 = Integer.parseInt(this.entrada.nextLine().trim());
        this.gestioBus.addParada(var2, var3);

        int var6 = -1;
        while (var6!=0) {
          try {
            System.out.print("Introduiu un altre numero de línea (0 per finalitzar) : ");
            if ((var6 = Integer.parseInt(this.entrada.nextLine().trim()))>0) {
              this.gestioBus.addLiniaDeParada(var2, var6);
            }
          } catch (NumberFormatException error) {
            var6=0;
          }
        }

        var1 = false;
      } catch (Exception error ) {
        System.err.println("Paràmetres incorrectes");
      }
    }
  }


  public void altaParadaEnLinea() {

    boolean var1 = true;
    while (var1) {
      try {
        System.out.print("Introduïu un nom de Parada nou            : ");
        String var2 = this.entrada.nextLine().trim();

        System.out.print("Introduïu un numero de Linea de la Parada : ");
        int var3 = Integer.parseInt(this.entrada.nextLine().trim());

        System.out.print("Introduïu la Parada Anterior              : ");
        String var4 = this.entrada.nextLine().trim();

        System.out.print("Introduïu la Parada Posterior             : ");
        String var5 = this.entrada.nextLine().trim();

        this.gestioBus.addParadaEnLinea(var2, var3,var4,var5);

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

        this.gestioBus.addCondVetera(var2, var3, var4);
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

        this.gestioBus.addCondAprenent(var2, var3);
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
        System.out.println("3. Alta de Parades (cal una linea com a minim)/ afegir linies a parada");
        System.out.println("4. Alta de ParadaEnLinea");
        System.out.println("10. Alta Conductor Vetera");
        System.out.println("10. Alta Conductors Aprenent");
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
