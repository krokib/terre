/*
 * Epreuve Terre - Puissance d'un nombre
 * 
 * Créez un programme qui affiche le résultat d’une puissance.
 * L’exposant ne pourra pas être négatif.
 * 
 * Exemples d’utilisation :
 * $> node exo.js 2 3
 * 8
 * 
 * Attention : je compte sur vous pour gérer les potentielles erreurs d’arguments.
 * 
 * Fonctions interdites:
 * -La fonction pow
 */

 public class Terre08 {
 
    private static void messageErreur() {
        System.out.println("erreur.");
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            messageErreur();
        } else if (!args[0].matches("[+-]?[0-9]+") || !args[1].matches("[+]?[0-9]+")) {
            messageErreur();
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = 1;
            for (int i = 0; i < b; i++) {
                result = result * a;
            }
            System.out.println(result);
        }
    }
 }