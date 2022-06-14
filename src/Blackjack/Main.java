

public class Main {

    public static void main(String[] args){
        CreationPaquet cp = new CreationPaquet();
        Paquet paquet32 = CreationPaquet.creation32Cartes(cp.creationHauteur8(), cp.creationCouleur());

        paquet32.affichage();
    }
}
