/*
 * Epreuve Terre - L'alphabet à partir de
 * 
 * Créez un programme qui affiche l’alphabet à partir de la lettre donnée en argument en lettres minuscules suivi d’un retour à la ligne.
 * 
 * Exemples d’utilisation :
 * $> python exo.py n
 * nopqrstuvwxyz
 * $>
 * 
 * Attention : votre programme devra utiliser une boucle
 */

 public class Terre03 {

    private static void messageErreur()
    {
        System.out.println("Veuillez entrer une seule lettre minuscule en argument.");
    }

    public static void main(String[] args)
    {
        if (args.length != 1){
            messageErreur();
        } else if (args[0].length() > 1) {
            messageErreur();
        } else if (!args[0].matches("[a-z]")) {
            messageErreur();
        } else {
            char lettreDebut = args[0].toCharArray()[0];
            for (int i = (int) lettreDebut; i <= (int) 'z'; i++) {
                System.out.print((char) i);
            }
            System.out.println("");
        }
    }
 }