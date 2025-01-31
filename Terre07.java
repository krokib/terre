/*
 * Epreuve Terre - Taille d'une chaîne
 * 
 * Créez un programme qui affiche le nombre de caractères d’une chaîne de
 * caractères passée en argument.
 * 
 * Exemples d’utilisation :
 * $> python exo.py “Hello world!”
 * 12
 * $> python exo.py
 * erreur.
 * $> python exo.py “Bonjour” “Aurevoir”
 * erreur.
 * $> python exo.py 10
 * erreur.
 * 
 * Fonctions interdites:
 * -La fonction length
 * -La fonction size
 */

 public class Terre07 {
 
    private static void messageErreur() {
        System.out.println("erreur.");
    }
    public static void main(String[] args) {
        if (args.length != 1) {
            messageErreur();
        } else if (args[0].matches("[+-]?[0-9]+")) {
            messageErreur();
        } else {
            int count = 0;
            for (char car : args[0].toCharArray()) {
                count++;
            }
            System.out.println(count);
        }
    }
 }