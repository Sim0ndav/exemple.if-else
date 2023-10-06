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

        if (nbDeVentes >= quota) {
            salaireFinal = salaireDeBase + primePotentielle;
            System.out.println("Félicitations ! Vous avez rempli le quota de ventes. ");
        } else {
            int nbDeVentesManquantes = quota - nbDeVentes;
            System.out.println("Il vous manque " + nbDeVentesManquantes + " ventes pour atteindre le quota.");
        }

        System.out.println("Votre salaire sera de " + salaireFinal + " euros ");
    }

}
