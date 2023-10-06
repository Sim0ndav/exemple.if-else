package fr.sdavid;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int salaireDeBase = 400;
        int primePotentielle = 250;
        int quota = 10;
        int salaireFinal = salaireDeBase;

        // demande du nombres de ventes/ semaine
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez saisir votre nombre de ventes cette semaine :");
        int nbDeVentes = clavier.nextInt();
        clavier.close();

        // si quota valide alors félicitations + ajout de prime au salaire de base.
        if (nbDeVentes > quota) {

            salaireFinal = salaireDeBase + primePotentielle;

            System.out.println("Félicitations ! Vous avez rempli le quota de ventes. ");
        }
        // si le nombres de ventes est tout juste au quota alors affiche tout juste +
        // ajout de prime au salaire de base
        else if (nbDeVentes == quota) {
            salaireFinal = salaireDeBase + primePotentielle;
            System.out.println("Tout juste !");
        }
        // sinon nombre de ventes manquantes pour atteindre quota + salaire ne change
        // pas
        else {
            int nbDeVentesManquantes = quota - nbDeVentes;
            System.out.println("Il vous manque " + nbDeVentesManquantes + " ventes pour atteindre le quota.");
        }

        // affichage du salaire final
        System.out.println("Votre salaire sera de " + salaireFinal + " euros. ");
    }

}
