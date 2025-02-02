/*
 * Epreuve terre - 24 to 12
 * 
 * Créez un programme qui transforme une heure affichée en format 24h en
 * une heure affichée en format 12h.
 * 
 * Exemples d’utilisation :
 * $> ruby exo.rb 23:40
 * 11:40PM
 * 
 * Attention : midi et minuit.
 */

 public class Terre11 {
 
    private static void messageErreur() {
        System.out.println("Veuillez entrer une heure dans ce format : HH:MM");
    }

    private static boolean testFormatHeure(String str) {
        String regex24 = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        return str.matches(regex24);
    }

    private static void changeFormatHeure(String str) {
        final char[] HEURE24 = str.toCharArray();
        char[] heure12 = new char[5];
        
        //indice de ':' pour traiter H:MM et HH:MM séparément
        int indexDoubleCot = 0;
        while (HEURE24[indexDoubleCot] != ':') {
            indexDoubleCot++;
        }
        
        //Remplissage des minutes de heure12 ':MM'
        for (int i = 0; i < 3; i++) {
            heure12[2 + i] = HEURE24[indexDoubleCot + i];
        }
        
        //Récupération du nombre d'heures de HEURE24 dans un char[]
        char[] heures24CHAR = new char[indexDoubleCot];
        for (int i = 0; i < indexDoubleCot; i++) {
            heures24CHAR[i] = HEURE24[i];
        }

        //Conversion des heures de HEURE24 en int
        int heures24INT = Integer.parseInt(String.copyValueOf(heures24CHAR));

        //Conversion des heures 24 en 12
        int heures12INT;
        boolean morning;
        if (heures24INT == 0 || heures24INT == 12) {
            morning = (heures24INT == 0);
            heures12INT = 12;
        } else {
            morning = (heures24INT < 12);
            heures12INT = morning ? heures24INT : heures24INT - 12;
        }

        heure12[0] = Character.forDigit((heures12INT / 10), 10);
        heure12[1] = Character.forDigit((heures12INT % 10), 10);

        System.out.println(String.copyValueOf(heure12) + (morning ? "AM" : "PM"));
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            messageErreur();
        } else if (!testFormatHeure(args[0])) {
            messageErreur();
        } else {
            changeFormatHeure(args[0]);
        }
    }
 }