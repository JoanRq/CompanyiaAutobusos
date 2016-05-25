package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by joan on 24/05/2016.
 */
public class MainApp {
  private JButton button1;
  private JPanel MenuApp;

  public MainApp() {
    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        showMessageDialog(null,"Clicat button1");
      }
    });
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("MainApp");
    frame.setContentPane(new MainApp().MenuApp);
    // La aplicación acaba al darle a la X
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);


  }
}
