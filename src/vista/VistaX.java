package vista;

/**
 * Created by poo2 on 24/05/2016.
 */
import static javax.swing.JOptionPane.showMessageDialog;

import controlador.Controlador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaX extends JFrame implements ActionListener {
  private JTextField texto;
  Controlador c;

  public VistaX() {
    super("LA aplicación de autobuses");

    setSize(500, 600);

    // La aplicación acaba al darle a la X
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setLayout(new GridLayout(2, 1));
    texto = new JTextField();
    add(texto);
    JButton boton = new JButton("HAZ CLICK");
    add(boton);
    boton.addActionListener(this);

    setVisible(true);

    c = new Controlador();
  }

  public static void main(String[] args) {
    VistaX marco = new VistaX();

  }

  public void actionPerformed(ActionEvent e) {

    try {
      c.addLinia(Integer.parseInt(texto.getText()));
      showMessageDialog(this, "Guardado correctamente");
    } catch(Exception error) {
      showMessageDialog(this, "Error al introducir datos");
    }
  }
}
