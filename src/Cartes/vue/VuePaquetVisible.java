package vue;

import modele.Carte;
import modele.CreationPaquet;
import modele.Paquet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VuePaquetVisible extends JPanel implements ActionListener {
    /**
     *
     * @return
     */
	protected int mainJoueur = 0;
	protected int mainBanque = 0;
	protected int moins=0;
	protected int aW = 1280;
	protected int aH = 800;
	protected int gridX = 50;
	protected int gridY = 50;
	protected int gridW = 900;
	protected int gridH = 400;
    //card spacing and dimensions
	protected int spacing = 10;
	protected int cardSpacing = 10;
	protected int rounding = 10;
	protected int tCardW = (int) gridW/6;
	protected int tCardH = (int) gridH/2;
	protected int cardW = tCardW - spacing*2;
	protected int cardH = tCardH - spacing*2;
	protected int cardTW = gridW/6;
	protected int cardTH = gridH/2;
	protected int cardAW = cardTW-2*cardSpacing;
	protected int cardAH = cardTH-2*cardSpacing;
	protected int hsX = gridX+gridW+50;
	protected int hsY = gridY;
	protected int hsW =230;
	protected int hsH= 400;
	protected int pmX = hsX;
    protected int pmY= hsY+hsH+50;
    int pmW = hsW;
    int pmH = 200;
	protected Color backgroundColor = new Color(39,100,15);
	protected List<Carte> toutesLesCartes ;
	protected List<Carte> joueurCartes;
	protected List<Carte>  banqueCartes ;
	protected CreationPaquet cp = new CreationPaquet();
	protected Paquet paquet;

	 public VuePaquetVisible(Paquet p){
		 	this.paquet = p;
		 	toutesLesCartes = cp.creation32Cartes();
		 	joueurCartes = cp.carteJoueur();
		 	banqueCartes = cp.carteBanque();
	 }
	 
	 public void paintComponent(Graphics g){
	       //Dessiin des rectangles
	       g.setColor(backgroundColor);
	       g.fillRect(0, 0, aW, aH);
	       g.setColor(Color.black);
	       g.drawRect(gridX, gridY, gridW, gridH);
	       g.drawRect(gridX, gridY+gridH+50, gridW, 500);
	       g.drawRect(hsX, hsY, hsW, hsH);
	       String joueurTEXTE ="La Main du joueur est de : ";
	       g.drawString(joueurTEXTE , 50, 550);   
	 }
	
	 @Override
		public void actionPerformed(ActionEvent e) {		 
		 Carte c = cp.carteAuHasard();
		 moins = cp.ValeurCarte(c);
		 System.out.println(c.toString());
		 joueurCartes.add(c);
		 System.err.println("main avant boucle "+joueurCartes.size());
		 Carte o;
		 for(int i=0;i<joueurCartes.size();i++) {
		 	o = joueurCartes.get(i);
		 	JButton carte = new JButton(o.getValeur() + " \n "+ o.getCouleur());
	      	carte.setSize(50, 50);
	      	carte.setBackground(Color.black);
	      	carte.setBounds(gridX+i*cardTW+cardSpacing, gridY+cardSpacing, cardAW,cardAH);
	      	this.add(carte);
	      	repaint();
		 }
		 mainJoueur = cp.calculeMain(joueurCartes) - moins;
		 System.out.println("main joueur :" +mainJoueur);
		 JButton affichemain = new JButton( Integer.toString(mainJoueur));
    	 affichemain.setBounds(100,200,100,100);
		}	 	
}