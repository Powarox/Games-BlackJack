package vue;

import modele.CreationPaquet;
import modele.Paquet;
import java.awt.Graphics;
import javax.swing.JPanel;

public class VuePaquetCache extends JPanel {
    private CreationPaquet cp = new CreationPaquet();
      
    public VuePaquetCache(Paquet p){}
    
    public void paintComponent(Graphics g){
        /*super.paintComponent(g);
        this.setBackground( Color.blue );
        g.setColor( Color.yellow );
       //Desssiner un Rectangle et modifier sa couleur de fond
        g.setColor( Color.white );
        g.drawRect( 0, 0, 50, 50 );
        g.setColor( Color.white );

        for(int i =0 ;i<32;i++){
            Carte c = cp.creation32Cartes().pos(i);
            g.drawString(c.getValeur(),i*60,50);
            g.drawString(c.getCouleur(),i*60,80);
            g.setColor( Color.red );
            g.drawRect( i*60, 5, 50, 100 );
            CreationPaquet paquet = new CreationPaquet();
            Paquet p = cp.creation32Cartes();
            for(int i=0;i<32;i++){
                if(i%2==0){
                g.setColor( Color.white );
                    g.drawRect( i+1, i+5, 50, 100 );
                }
                else{
                g.setColor( Color.black );
                    g.fillRect( i+1, i+5, 50, 100 );
                }
            }
        }*/
    }
}
    

