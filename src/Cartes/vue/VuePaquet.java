package vue;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import modele.Paquet;
import controleur.ControleurChoixCarteVersPaquet;

public class VuePaquet extends JFrame {
		private int hauteur = 800;
		private int largeur = 1300;
		private Color couleurBoutton = new Color(109,150,125);
		private Color backgroundColor = new Color(39,100,15);
		private JButton boutonJouer = new JButton("Jouer");
		private JButton bouttonTirer = new JButton("Tirer !");
		private JButton bouttonRester = new JButton("Rester");

		//JLabel label = new JLabel("texte");
		public VuePaquet(Paquet p){
			this.setSize(largeur,hauteur);
			this.setTitle("BlackJAck");
			this.setResizable(false);
			this.setVisible(true);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			VuePaquetVisible vuePaquetVisible = new VuePaquetVisible(p);
			//controlleur et bouton jouer 
			ControleurChoixCarteVersPaquet controleurChoixCarteVersPaquet = new ControleurChoixCarteVersPaquet(vuePaquetVisible, p);
			//BOutton jouer
			boutonJouer.setBounds(vuePaquetVisible.pmX+10, vuePaquetVisible.pmY+110, 100, 80);
			boutonJouer.setBackground(couleurBoutton);
			boutonJouer.addActionListener(vuePaquetVisible);
			bouttonTirer.setBounds(vuePaquetVisible.hsX+55, vuePaquetVisible.hsY+40, 120, 80);
			bouttonTirer.setBackground(couleurBoutton);
			bouttonTirer.addActionListener(vuePaquetVisible);
			this.setContentPane(vuePaquetVisible);
			this.setLayout(null);
			vuePaquetVisible.add(boutonJouer);
			vuePaquetVisible.add(bouttonTirer);
			vuePaquetVisible.add(bouttonRester);
		}	 
}
