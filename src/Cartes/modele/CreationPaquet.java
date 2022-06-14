/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author 21711412
 */

public class CreationPaquet {
    private Paquet p = new Paquet(null);

	public static List<Carte> toutesLesCartes(){
		return creation32Cartes();
	}
	
    public static int calculeMain(List<Carte> liste) {
    	int som =0;
    	Carte c;
    	int valeurCarte =0;
    	for(int i=0;i<liste.size();i++){
        	c = liste.get(i);
        	valeurCarte=ValeurCarte(c);
        	som+=valeurCarte;
        }
    	return som;    
    }
    
	public static int ValeurCarte(Carte c){
    	int valeur = 0;
        if(c.getValeur() == "as"){
            valeur = 11;
        }
        if(c.getValeur() == "2"){
            valeur = 2;
        }
        if(c.getValeur() == "3"){
            valeur = 3;
        }
        if(c.getValeur() == "4"){
            valeur = 4;
        }
        if(c.getValeur() == "5"){
            valeur = 5;
        }
        if(c.getValeur() == "6"){
            valeur = 6;
        }
        if(c.getValeur() == "7"){
            valeur = 7;
        }
        if(c.getValeur() == "8"){
            valeur = 8;
        }
        if(c.getValeur() == "9"){
            valeur = 9;
        }
        if(c.getValeur() == "10"){
            valeur = 10;
        }
        if(c.getValeur() == "valet"){
            valeur = 10;
        }
        if(c.getValeur() == "dame"){
            valeur = 10;
        }
        if(c.getValeur() == "roi"){
            valeur = 10;
        }
        return valeur;
    }

	public static List<Carte> carteJoueur(){
	    List<Carte> paquet = new ArrayList<Carte>();
	 	return paquet;
	}

	public static List<Carte> carteBanque(){
	    List<Carte> paquet = new ArrayList<Carte>();
	    return paquet;
    }

    public static Carte carteAuHasard(){  // plus de paramettre !
	    Random rand = new Random();
	    int l = creation32Cartes().size();
	    int x = rand.nextInt((l));
	    return creation32Cartes().get(x);
	}

    // methode a verifier si ca marche bien *******
    public static List<Carte> retirerCarte( List<Carte> liste ,Carte c){
    	for(int i =0 ; i< liste.size(); i++) {
    		if (liste.get(i)==c) {
    			liste.remove(c);
    		}
    	}
    	return liste;
    }

    public static List<Carte> creation32Cartes(){
        List<Carte> listCarte = new ArrayList();
        for(int i=0; i<creationCouleur().size(); i++){
            for(int j=0; j<creationHauteur8().size(); j++){
                listCarte.add(new Carte(creationHauteur8().get(j), creationCouleur().get(i)));
            }
        }
        return listCarte;
    }

    public static List<Carte> creation52Cartes(){
        List<Carte> listCarte = new ArrayList();
        for(int i=0; i<creationCouleur().size(); i++){
            for(int j=0; j<creationHauteur13().size(); j++){
                listCarte.add(new Carte(creationHauteur13().get(j), creationCouleur().get(i)));
                //System.out.println(new Carte(hauteur.get(j), couleur.get(i)));
            }
        }
        return listCarte;
    }

    public static List<String> creationCouleur(){
        List<String> couleur = new ArrayList();
        couleur.add("♠");
        couleur.add("♣");
        couleur.add("♦");
        couleur.add("♥");
        return couleur;
    }

    public static List<String> creationHauteur8(){
        List<String> hauteur = new ArrayList();
        hauteur.add("as");
        hauteur.add("7");
        hauteur.add("8");
        hauteur.add("9");
        hauteur.add("10");
        hauteur.add("valet");
        hauteur.add("dame");
        hauteur.add("roi");
        return hauteur;
    }

    public static List<String> creationHauteur13(){
        List<String> hauteur = new ArrayList();
        hauteur.add("as");
        hauteur.add("2");
        hauteur.add("3");
        hauteur.add("4");
        hauteur.add("5");
        hauteur.add("6");
        hauteur.add("7");
        hauteur.add("8");
        hauteur.add("9");
        hauteur.add("10");
        hauteur.add("valet");
        hauteur.add("dame");
        hauteur.add("roi");
        return hauteur;
    }
}
