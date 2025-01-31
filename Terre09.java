/*
 * Epreuve terre - Racine carrée d’un nombre
 * 
 * Créez un programme qui affiche la racine carrée d’un entier positif.
 * 
 * Exemples d’utilisation :
 * $> node exo.js 9
 * 3
 * 
 * Attention : je compte sur vous pour gérer les potentielles erreurs d’arguments.
 * Fonctions interdites:
 * -La fonction sqrt
 */

 public class Terre09 {
 
    private static void messageErreur() {
        System.out.println("Veuillez entrer un et un seul nombre positif.");
    }

    private static void racine(int nb) {
        int racine = 1;
        while ((racine * racine) < nb) {
            racine++;
        }            
        System.out.println((racine * racine == nb) ? racine : "Pas de racine entière");
    }
    
    public static void main(String[] args) {
        if (args.length != 1) {
            messageErreur();
        } else if (!args[0].matches("[0-9]+")) {
            messageErreur();
        } else {
            racine(Integer.parseInt(args[0]));
        }
    }
 }