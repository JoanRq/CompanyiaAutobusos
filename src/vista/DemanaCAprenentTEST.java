package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by joan on 28/05/2016.
 */
public class DemanaCAprenentTEST extends JFrame implements ActionListener {

  private JList list ;

  private JScrollPane sp;
  private JButton btn;


  private Controlador ctrl;

  public DemanaCAprenentTEST(String nomMenu, Controlador c) {
    super(nomMenu);

    ctrl = c;
    Object[] keys = (Object[]) ctrl.numLinines.keySet().toArray();
    Arrays.sort(keys);
    String[] llista = new String[keys.length + 1];
    int i = 0;
    for (Object ob : keys)
      llista[i++] = ob.toString();

    list = new JList(llista);

    sp= new JScrollPane(list);
    btn = new JButton("Add");




    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);

    Container frame = getContentPane();
    JPanel jp = new JPanel();
    sp.setPreferredSize(new Dimension(100,200));
    jp.add(sp);
    btn.addActionListener(this);
    frame.add(jp,BorderLayout.NORTH);
    frame.add(btn,BorderLayout.SOUTH);
    pack();


    //llistaLiniesAssignades = new JList<String>(llista);


//    desarButton.addActionListener(this);
//    sortirButton.addActionListener(this);

//    DefaultComboBoxModel dcbm = new DefaultComboBoxModel(ctrl.numLinines.keySet().toArray());
/*
    DefaultComboBoxModel dcbm = new DefaultComboBoxModel(keys);
    dcbm.insertElementAt(" ", 0);
    dcbm.setSelectedItem(" ");
    cBLiniaDeBus.setModel(dcbm);
*/
    setVisible(true);


  }

  public static void main(String[] args) {
    Controlador controlador = new Controlador();
    new DemanaCAprenentTEST("Demana Aprenent", controlador);

  }

  public void actionPerformed(ActionEvent e) {
/*
    String botoApretat;
    System.out.println("Adeu" + e);
    try {
      botoApretat = e.getActionCommand().trim();
    } catch (Exception error) {
      botoApretat = "sortirButton";
      showMessageDialog(this, "Error al introducir datos");
    }

    if (botoApretat.equals("sortirButton")) {
      System.out.println("Sortim!!!");
      setVisible(false); //you can't see me!
      dispose(); //Destroy the JFrame object

    } else if (botoApretat.equals("desarButton")) {
      System.out.println("DESEM: " + dni.getText() + ", " + nomConductor.getText() + ", " + Integer.parseInt("0" + cBLiniaDeBus.getSelectedItem()));
      try {
        ctrl.addCondVetera(dni.getText().trim(),
            nomConductor.getText().trim(),
            Integer.parseInt("0" + cBLiniaDeBus.getSelectedItem()));
        showMessageDialog(null, "Guardado correctamente");
        dni.setText("");
        nomConductor.setText("");
        cBLiniaDeBus.setSelectedItem(" ");
      } catch (Exception error) {
        System.err.println("Paràmetres incorrectes");
      }

    }

*/
  }


}

