/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Paquet  {
    private Carte carte;
    private List<Carte> paquet;
    private CreationPaquet cp;
    
    public Paquet(List<Carte> p){
        this.paquet = p;
    }
    
    public void retirerPremierCarte(){
        this.paquet.remove(0);
    }
   
    public void retirerCarteEnX(int x){
        this.paquet.remove(x);
    } 
     
    public List<Carte> toutesLesCartes(){
    	 return this.paquet;
    }
    
    public void affichage(){
        for(int i=0; i<this.paquet.size(); i++){
            System.out.print(this.paquet.get(i));
        }
    }
    
    public List<Carte> ajoutCarteDessous(List<Carte> l, Carte c){
        l.add(c);
        return l;
    }

    public List<Carte> ajoutCarteDessus(List<Carte> l, Carte c){
        l.add(0, c);
        return l;
    }
    
    public void melangerPaquet(){  // plus de paramettre 
        Collections.shuffle(this.paquet);
        System.out.println(this.paquet);
    }
    
    public void couperPaquet(){
        List<Carte> paquetFinal =  new ArrayList<Carte>() ;
        int l = this.paquet.size();
        int min = 3 , max = l - 3;
        Random rand= new Random();
        int a = rand.nextInt((max + 1) - min) + min;
        Carte carteArret = this.paquet.get(a);
        Carte carte0 = this.paquet.get(0);
        for(int j=a; j<l; j++){
            paquetFinal.add(this.paquet.get(j));
        }
        for(int i=0; i<a; i++){
            paquetFinal.add(this.paquet.get(i));
        }
        System.out.println(paquetFinal);
    }
    
    public int taille_paquet(){
        int p=0;
        for(int i=0;i<this.paquet.size();i++){
                p=p+i;
        }
        return p;
    }
    
    public Carte getCarte(int i) {
    	return this.paquet.get(i);
    }
    
    public int taillePaquet() {
    	return this.paquet.size();
    }
}