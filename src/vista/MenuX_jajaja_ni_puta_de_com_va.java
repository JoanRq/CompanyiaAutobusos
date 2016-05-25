package vista;
import controlador.Controlador;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by joan on 24/05/2016.
 */
public class MenuX_jajaja_ni_puta_de_com_va extends JFrame implements ActionListener {

  private JButton altaConductorsButton;
  private JButton altaLíniesButton;
  private JButton altaAutobusosButton;
  private JButton sortirButton;
  private JTextField texto;

  Controlador c;

  public MenuX_jajaja_ni_puta_de_com_va() {
    super("LA aplicación de autobuses");

    setSize(500, 600);

    // La aplicación acaba al darle a la X
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridLayout(8,1));
    add(altaConductorsButton);
    add(altaLíniesButton);
    add(altaAutobusosButton);
    add(sortirButton);

    setVisible(true);

    c = new Controlador();
    altaConductorsButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        showMessageDialog(null,"Clicat altaConductorsButton");
      }
    });
    altaLíniesButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        showMessageDialog(null,"Clicat altaLíniesButton");
      }
    });
    altaAutobusosButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        showMessageDialog(null,"Clicat altaAutobusosButton");
      }
    });
    sortirButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        showMessageDialog(null,"Clicat sortirButton");

      }
    });
  }

  public static void main(String[] args) {
    MenuX_jajaja_ni_puta_de_com_va marco = new MenuX_jajaja_ni_puta_de_com_va();



  }

  public void actionPerformed(ActionEvent e) {

    System.out.println(e);
    try {
      c.addLinia(Integer.parseInt(texto.getText()));
      showMessageDialog(this, "Guardado correctamente");
    } catch(Exception error) {
      showMessageDialog(this, "Error al introducir datos");
    }
  }

  public void setData(MenuX_jajaja_ni_puta_de_com_va data) {
  }

  public void getData(MenuX_jajaja_ni_puta_de_com_va data) {
  }

  public boolean isModified(MenuX_jajaja_ni_puta_de_com_va data) {
    return false;
  }
}
