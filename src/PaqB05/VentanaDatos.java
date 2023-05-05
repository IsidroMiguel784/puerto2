package PaqB05;


import PaqB05.interfaz.VentanaPrincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaDatos extends JFrame {
    public JPanel JPanelPrincipal;
    private JButton cerrarButton;
    private JLabel ContenedorJLabel;

    private VentanaPrincipal principal;

    private Hub hub;

    private Contenedor cont;

    private int nContenedor;

    public VentanaDatos(VentanaPrincipal v) {
        setContentPane(JPanelPrincipal);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        pack();
        setVisible(false);
        setIconImage(new ImageIcon("src/PaqB05/interfaz/contenedores.png").getImage());
        this.principal = v;


        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                principal.setContentPane(principal.miPanel);
                repaint();
            }
        });


    }




}


