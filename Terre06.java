/*
 * Epreuve Terre - Inverser une chaîne
 * 
 * Créez un programme qui affiche l’inverse de la chaîne de caractères
 * donnée en argument.
 * 
 * Exemples d’utilisation :
 * $> node exo.js “Hello world!”
 * !dlrow olleH
 * $> node exo.js “lehciM”
 * Michel
 * 
 * Attention : je compte sur vous pour gérer les potentielles erreurs d’arguments.
 * 
 * Fonctions interdites:
 * -La fonction reverse
 */

 public class Terre06 {
 
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Veuillez entrer un argument.");
        } else {
            char[] chaine = args[0].toCharArray();
            for (int i = chaine.length - 1; i >= 0; i--) {
                System.out.print(chaine[i]);
            }
            System.out.println("");
        }
    }
 }