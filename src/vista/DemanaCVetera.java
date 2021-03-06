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
public class DemanaCVetera extends JFrame implements ActionListener {

  private JButton desarButton;
  private JButton sortirButton;
  private JTextField dni;
  private JTextField nomConductor;
  private JComboBox cBLiniaDeBus;
  private JLabel lbDemanaCVetera;
  private JLabel lbDNI;
  private JLabel lbLineaVetada;

  private JPanel demanaCVetera;

  private Controlador ctrl;

  public DemanaCVetera(String nomMenu, Controlador c) {
    super(nomMenu);
    ctrl = c;
    Object[] keys = (Object[]) ctrl.numLinines.keySet().toArray();
    Arrays.sort(keys);

    setContentPane(demanaCVetera);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);

    desarButton.addActionListener(this);
    sortirButton.addActionListener(this);

//    DefaultComboBoxModel dcbm = new DefaultComboBoxModel(ctrl.numLinines.keySet().toArray());
    DefaultComboBoxModel dcbm = new DefaultComboBoxModel(keys);
    dcbm.insertElementAt(" ", 0);
    dcbm.setSelectedItem(" ");
    cBLiniaDeBus.setModel(dcbm);

    setVisible(true);


  }

  public static void main(String[] args) {


  }

  public void actionPerformed(ActionEvent e) {

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
      System.out.println("DESEM: " + dni.getText() + ", " + nomConductor.getText() + ", " + Integer.parseInt(("0" + cBLiniaDeBus.getSelectedItem()).trim()));
      try {
        ctrl.addCondVetera(dni.getText().trim(),
            nomConductor.getText().trim(),
            Integer.parseInt(("0" + cBLiniaDeBus.getSelectedItem()).trim()));
        showMessageDialog(null, "Guardado correctamente");
        dni.setText("");
        nomConductor.setText("");
        cBLiniaDeBus.setSelectedItem(" ");
      } catch (Exception error) {
        System.err.println("Paràmetres incorrectes");
      }

    }


  }


  {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer
   * >>> IMPORTANT!! <<<
   * DO NOT edit this method OR call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    demanaCVetera = new JPanel();
    demanaCVetera.setLayout(new GridBagLayout());
    lbLineaVetada = new JLabel();
    lbLineaVetada.setText("Linia Vetada");
    GridBagConstraints gbc;
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 3;
    gbc.anchor = GridBagConstraints.WEST;
    demanaCVetera.add(lbLineaVetada, gbc);
    final JPanel spacer1 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 4;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 100;
    demanaCVetera.add(spacer1, gbc);
    desarButton = new JButton();
    desarButton.setActionCommand("desarButton");
    desarButton.setText("Desar");
    gbc = new GridBagConstraints();
    gbc.gridx = 5;
    gbc.gridy = 5;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaCVetera.add(desarButton, gbc);
    sortirButton = new JButton();
    sortirButton.setActionCommand("sortirButton");
    sortirButton.setText("Sortir");
    gbc = new GridBagConstraints();
    gbc.gridx = 6;
    gbc.gridy = 5;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaCVetera.add(sortirButton, gbc);
    final JPanel spacer2 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 5;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaCVetera.add(spacer2, gbc);
    final JPanel spacer3 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 6;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaCVetera.add(spacer3, gbc);
    final JPanel spacer4 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 120;
    demanaCVetera.add(spacer4, gbc);
    cBLiniaDeBus = new JComboBox();
    gbc = new GridBagConstraints();
    gbc.gridx = 4;
    gbc.gridy = 3;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaCVetera.add(cBLiniaDeBus, gbc);
    final JPanel spacer5 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaCVetera.add(spacer5, gbc);
    final JPanel spacer6 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 7;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaCVetera.add(spacer6, gbc);
    final JPanel spacer7 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 5;
    demanaCVetera.add(spacer7, gbc);
    lbDemanaCVetera = new JLabel();
    lbDemanaCVetera.setText("Nom Conductor");
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.WEST;
    demanaCVetera.add(lbDemanaCVetera, gbc);
    lbDNI = new JLabel();
    lbDNI.setText("DNI Conductor");
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.WEST;
    demanaCVetera.add(lbDNI, gbc);
    dni = new JTextField();
    gbc = new GridBagConstraints();
    gbc.gridx = 4;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaCVetera.add(dni, gbc);
    nomConductor = new JTextField();
    gbc = new GridBagConstraints();
    gbc.gridx = 4;
    gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaCVetera.add(nomConductor, gbc);
    final JPanel spacer8 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 5;
    demanaCVetera.add(spacer8, gbc);
    final JPanel spacer9 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 5;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 20;
    demanaCVetera.add(spacer9, gbc);
    final JPanel spacer10 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 6;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 100;
    demanaCVetera.add(spacer10, gbc);
    final JPanel spacer11 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 15;
    demanaCVetera.add(spacer11, gbc);
    final JPanel spacer12 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 15;
    demanaCVetera.add(spacer12, gbc);
    final JPanel spacer13 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 15;
    demanaCVetera.add(spacer13, gbc);
    final JPanel spacer14 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 100;
    demanaCVetera.add(spacer14, gbc);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return demanaCVetera;
  }
}
