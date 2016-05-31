package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by joan on 29/05/2016.
 */
public class DemanaParadaEnLinia extends JFrame implements ActionListener {
  private JComboBox cbParada;
  private JComboBox cbLinia;
  private JButton desarButton;
  private JButton sortirButton;
  private JLabel lbParada;
  private JLabel lbLinia;

  private JPanel demanaParadaEnLinia;

  private Controlador ctrl;

  public DemanaParadaEnLinia(String nomMenu, Controlador c) {
    super(nomMenu);
    ctrl = c;

    Object[] keysL = (Object[]) ctrl.numLinines.keySet().toArray();
    Arrays.sort(keysL);

    Object[] keysP = (Object[]) ctrl.llistaParades.keySet().toArray();
    Arrays.sort(keysP);


    setContentPane(demanaParadaEnLinia);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    pack();
    setLocationRelativeTo(null);

    desarButton.addActionListener(this);
    sortirButton.addActionListener(this);

    DefaultComboBoxModel dcbmL = new DefaultComboBoxModel(keysL);
    dcbmL.insertElementAt(" ", 0);
    dcbmL.setSelectedItem(" ");
    cbLinia.setModel(dcbmL);

    DefaultComboBoxModel dcbmP = new DefaultComboBoxModel(keysP);
    dcbmP.insertElementAt(" ", 0);
    dcbmP.setSelectedItem(" ");
    cbParada.setModel(dcbmP);


    setVisible(true);

  }

  public static void main(String[] args) {
    Controlador controlador = new Controlador();
    DemanaParadaEnLinia dPEnLinea = new DemanaParadaEnLinia("Demanar Parada En Linia", controlador);


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
      System.out.println("DESEM: " + cbParada.getSelectedItem().toString() + ", " + Integer.parseInt(("0" + cbLinia.getSelectedItem()).trim()));
      try {
        ctrl.addParadaEnLinea(cbParada.getSelectedItem().toString(), Integer.parseInt(("0" + cbLinia.getSelectedItem()).trim()));
        showMessageDialog(null, "Guardado correctamente");
        cbParada.setSelectedItem(" ");
        cbLinia.setSelectedItem(" ");
      } catch (Exception error) {
        showMessageDialog(null, "Paràmetres incorrectes");
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
    demanaParadaEnLinia = new JPanel();
    demanaParadaEnLinia.setLayout(new GridBagLayout());
    lbParada = new JLabel();
    lbParada.setText("Nom Parada");
    GridBagConstraints gbc;
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.WEST;
    demanaParadaEnLinia.add(lbParada, gbc);
    lbLinia = new JLabel();
    lbLinia.setText("Linia en Parada");
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.anchor = GridBagConstraints.WEST;
    demanaParadaEnLinia.add(lbLinia, gbc);
    cbParada = new JComboBox();
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 1;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaParadaEnLinia.add(cbParada, gbc);
    cbLinia = new JComboBox();
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 2;
    gbc.gridwidth = 2;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaParadaEnLinia.add(cbLinia, gbc);
    final JPanel spacer1 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaParadaEnLinia.add(spacer1, gbc);
    final JPanel spacer2 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 100;
    demanaParadaEnLinia.add(spacer2, gbc);
    final JPanel spacer3 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaParadaEnLinia.add(spacer3, gbc);
    final JPanel spacer4 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 4;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaParadaEnLinia.add(spacer4, gbc);
    final JPanel spacer5 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaParadaEnLinia.add(spacer5, gbc);
    final JPanel spacer6 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 1;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 15;
    demanaParadaEnLinia.add(spacer6, gbc);
    final JPanel spacer7 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 2;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 15;
    demanaParadaEnLinia.add(spacer7, gbc);
    final JPanel spacer8 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 15;
    demanaParadaEnLinia.add(spacer8, gbc);
    final JPanel spacer9 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 0;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 50;
    demanaParadaEnLinia.add(spacer9, gbc);
    final JPanel spacer10 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 2;
    gbc.gridy = 5;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.ipady = 50;
    demanaParadaEnLinia.add(spacer10, gbc);
    final JPanel spacer11 = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx = 5;
    gbc.gridy = 3;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.ipadx = 50;
    demanaParadaEnLinia.add(spacer11, gbc);
    desarButton = new JButton();
    desarButton.setActionCommand("desarButton");
    desarButton.setText("Desar");
    gbc = new GridBagConstraints();
    gbc.gridx = 3;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaParadaEnLinia.add(desarButton, gbc);
    sortirButton = new JButton();
    sortirButton.setActionCommand("sortirButton");
    sortirButton.setText("Sortir");
    gbc = new GridBagConstraints();
    gbc.gridx = 4;
    gbc.gridy = 4;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    demanaParadaEnLinia.add(sortirButton, gbc);
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return demanaParadaEnLinia;
  }
}