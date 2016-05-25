package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by joan on 24/05/2016.
 */
public class MenuPrincipalTest extends JFrame implements ActionListener {
  private JButton bAltaConductor;
  private JButton bAltaDeLinies;
  private JButton bAltaDeParades;
  private JButton bAltaDeParadaEnLinea;
  private JButton bAltaConductorVetera;
  private JButton bAltaConductorAprenent;
  private JButton bSortir;
  private JTextField textField1;

  private JPanel menuPrincipal;
  private Controlador controlador = new Controlador();

  public MenuPrincipalTest() {
    super("Aplicación de autobuses");

    setContentPane(menuPrincipal);

    pack();
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    setVisible(true);

    bSortir.addActionListener(this);
    bAltaDeLinies.addActionListener(this);
/***
 *
 *   bSortir.addActionListener(new ActionListener() {
 *     @Override
 *     public void actionPerformed(ActionEvent actionEvent) {
 *       System.exit(0);
 *     }
 *   });
 */

    textField1.addInputMethodListener(new InputMethodListener() {
      @Override
      public void inputMethodTextChanged(InputMethodEvent inputMethodEvent) {
        showMessageDialog(MenuPrincipalTest.this, "inputMethodTextChanged" + textField1.toString());
      }

      @Override
      public void caretPositionChanged(InputMethodEvent inputMethodEvent) {
        showMessageDialog(MenuPrincipalTest.this, "caretPositionChanged" + textField1.toString());
      }
    });
    bAltaDeLinies.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        try {
          controlador.addLinia(Integer.parseInt("0"+textField1.getText().trim()));
          showMessageDialog(MenuPrincipalTest.this, "Guardado correctamente"+textField1.getText());
        } catch (Exception error ) {
          System.err.println("Paràmetres incorrectes");
        }

      }
    });
    bSortir.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    MenuPrincipalTest marco = new MenuPrincipalTest();
  }

  @Override
  public void actionPerformed(ActionEvent actionEvent) {
//    System.out.println("Adeu"+actionEvent);
  }

}
