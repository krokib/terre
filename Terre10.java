/*
 * Epreuve terre - Nombre premier
 * 
 * Créez un programme qui affiche si un nombre est premier ou pas.
 * 
 * Exemples d’utilisation :
 * $> node exo.js 5
 * Oui, 5 est un nombre premier.
 * $> node exo.js 6
 * Non, 6 n’est pas un nombre premier.
 * 
 * Attention : 0 et 1 ne sont pas des nombres premiers.
 * Gérez les erreurs d’arguments.
 */

 public class Terre10 {
 
    private static void messageErreur() {
        System.out.println("Veuillez entrer un nombre entier positif.");
    }

    private static void testPremier(int nb) {
        boolean premier = true;
        int facteur = 2;
        while (facteur < nb && premier) {
            premier = (nb % facteur != 0);
            facteur++;
        }
        System.out.println((premier && nb != 0 && nb != 1) ?
            "Oui, " + nb + " est un nombre premier." :
            "Non, " + nb + " n'est pas un nombre premier."
            );
    }
    
    public static void main(String[] args) {
        if (args.length != 1) {
            messageErreur();
        } else if (!args[0].matches("[+]?[0-9]+")) {
            messageErreur();
        } else {
            testPremier(Integer.parseInt(args[0]));
        }
    }
 }