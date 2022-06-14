/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controleur.ControleurChoixCarteVersPaquet;
import vue.VuePaquet;
import vue.VuePaquetVisible;
import modele.Paquet;
import modele.CreationPaquet;

/**
 *
 * @author 21711412
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Paquet paquet32 = new Paquet(CreationPaquet.creation32Cartes());
        paquet32.affichage();

         VuePaquet v = new VuePaquet(paquet32);
         VuePaquetVisible vuePaquetVisible = new VuePaquetVisible(paquet32);
         ControleurChoixCarteVersPaquet ControleurChoixCarteVersPaquet = new ControleurChoixCarteVersPaquet(vuePaquetVisible, paquet32);
        }
}
