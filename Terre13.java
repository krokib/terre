/*
 * Epreuve terre - Trouver la Suisse (lol)
 * 
 * Créez un programme qui prend en paramètre trois entiers et affiche la
 * valeur du milieu.
 * 
 * Exemples d’utilisation :
 * $> ruby exo.rb 11 40 34
 * 34
 * 
 * $> ruby exo.rb 2 1 3
 * 2
 * 
 * $> ruby exo.rb 2 2 2
 *  erreur.
 * 
 * Fonctions interdites:
 * -La fonction sort
 */


 public class Terre13 {
 
    private static void messageErreur() {
        System.out.println("erreur.");
    }

    private static boolean testArguments(String a, String b, String c) {
        boolean sontEntiers = a.matches("[0-9]+");
        sontEntiers &= b.matches("[0-9]+");
        sontEntiers &= c.matches("[0-9]+");
        boolean sontDifferents = a != b && a != c && b != c;
        return sontEntiers && sontDifferents;
    }

    private static boolean estMilieu(int a, int b, int c) {
        return (a < b && a > c) || (a > b && a < c);
    }

    private static void chercheLaSuisse(String strA, String strB, String strC) {
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);
        int intC = Integer.parseInt(strC);
        int resultat;
        if (estMilieu(intA, intB, intC)) {
            resultat = intA;
        } else if (estMilieu(intB, intA, intC)) {
            resultat = intB;
        } else {
            resultat = intC;
        }
        
        System.out.println(resultat);
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            messageErreur();
        } else if (!testArguments(args[0], args[1], args[2])) {
            messageErreur();
        } else {
            chercheLaSuisse(args[0], args[1], args[2]);
        }
    }
 }