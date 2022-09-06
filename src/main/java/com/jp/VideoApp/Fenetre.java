package com.jp.VideoApp;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
    public Fenetre() throws HeadlessException {
        //Définit un titre pour notre fenêtre
        this.setTitle("Ma première fenêtre Java");
        //Définit sa taille : 400 pixels de large et 100 pixels de haut
        this.setSize(100, 150);
        //Nous demandons maintenant à notre objet de se positionner au centre
        this.setLocationRelativeTo(null);
        //Termine le processus lorsqu'on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panneau pan = new Panneau();

        this.setContentPane(pan);

        //Et enfin, la rendre visible
        this.setVisible(true);
    }
}
