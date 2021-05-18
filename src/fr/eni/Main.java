package fr.eni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Demander un nombre a l'utilisateur

        int nombre1 = 0;
        int nombre2 = 0;
        String operateur = "";
        boolean saisieok = false;
        while (!saisieok) {
            try {
                System.out.println("Nombre 1 ? ");
                nombre1 = scan.nextInt();
                scan.nextLine();// <-- recupère la touche Entrée
                saisieok = true;
            } catch (InputMismatchException e) {
                System.err.println("Saisie incorrecte");
            }
        }
        //Demander un operateur à l'utilisateur
        System.out.println("Operateur ? ");
        operateur = scan.nextLine();
        //Deamnder un nombre à l'utilisateur
        System.out.println("Nombre 2 ? ");
        nombre2 = scan.nextInt();
        scan.nextLine();
        //On va utiliser une des methodes ajouter, soustraire, multiplier
        // avec les 3 valeurs recupérées
        try {
            Operation operation = new Operation();
            int resultat = 0;
            switch (operateur) {
                case "+":
                    resultat = operation.ajouter(nombre1, nombre2);
                    break;
                case "-":
                    resultat = operation.soustraire(nombre1, nombre2);
                    break;
                case "*":
                    resultat = operation.multiplier(nombre1, nombre2);
                    break;
            }
            System.out.println(nombre1 + operateur + nombre2 + "=" + resultat);
        } catch (DepassementCapaciteException e){
            System.err.println("Le resultat dépasse la capacité de la calculatrice");
        }

    }

}
