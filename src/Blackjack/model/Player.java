/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import cartes.Paquet;

import cartes.Carte;
import java.util.*;

/**
 *
 * @author 21811673
 */
public class Player { 
    final static int MAX_CARDS = 52;                    // nombre maximum de cartes dans une main, ca doit etre la valeur de retour de la fonction creation52Cartes
    protected List<Carte> paquet = new ArrayList<>();
    private int NombreTotal = 0;                                  // nombre de cartes
    private String name;
    private int x, y;                                   // emplacement pour dessiner la case d'un joueur ou il faut superposer les cartes

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Carte PremiereCarte(){
        //utiliser  retirerCarteEnX
        return paquet.get(0);
    }    // retourne la premiere carte
    public void ajouterCarte(Carte c) {
        // utiliser ajoutCarteDessus
    }    // inserer une carte
    public void reset() {
        NombreTotal = 0;
    }    // remettre le paquet a zero

    // pour une  main de blackjack d'un joueur on compte la valeur
    public int value() {
        int val = 0;
        boolean avoirAs = false;
        for (int i = 0; i < NombreTotal; i++) {
            val = val + paquet.get(i).rang();
            if (paquet.get(i).cestUnAs()) avoirAs = true;
        }
        if (avoirAs && (val <= 11)) val = val + 10;          // handle ace = 1 or 11
        return val;
    }

    // dessiner la pile de carte, la premiere centrée sur (x, y)
    public void draw(Draw d) {
        for (int i = 0; i < N; i++)
            paquet.get(i).draw(d, x + i*25, y);//pour chaque carte on la superpose a l'autre, la classe draw je pense qu'elle existe dans java
    }



}
