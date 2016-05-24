package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by joan on 24/05/2016.
 */
public class MenuPrincipalTest {
  private JPanel menuPrincipal;

  private JButton bAltaConductor;
  private JButton bAltaDeLinies;
  private JButton bAltaDeParades;
  private JButton bAltaDeParadaEnLinea;
  private JButton bAltaConductorVetera;
  private JButton bAltaConductorAprenent;
  private JButton bSortir;

  public MenuPrincipalTest() {
    bSortir.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    JFrame marc = new JFrame("MenuPrincipalTest");
    marc.setContentPane(new MenuPrincipalTest().menuPrincipal);
    marc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marc.pack();
    marc.setVisible(true);

  }

}
