package controleur;

import modele.Paquet;
import vue.VuePaquetVisible;


public class ControleurChoixCarteVersPaquet {
    private VuePaquetVisible vueSource;
    private Paquet destinaton;

    public ControleurChoixCarteVersPaquet(VuePaquetVisible vueSource, Paquet destination){
        this.vueSource = vueSource;
        this.destinaton = destination;
    }
    
    public VuePaquetVisible getVuePaquetVisible() {
    	return this.vueSource;
    }

    public Paquet getPaquetDestination() {
    	return this.destinaton;
    }  
}
