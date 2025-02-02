/*
 * Epreuve terre - 12 to 24
 * 
 * Créez un programme qui transforme une heure affichée en format 12h en
 * une heure affichée au format 24h.
 * 
 * Exemples d’utilisation :
 * $> ruby exo.rb 11:40PM
 * 23:40
 * 
 * Attention : midi et minuit.
 */

public class Terre12 {

    private static void messageErreur() {
        System.out.println("Veuillez entre une heure dans le format hh:mmAM ou hh:mmPM.");
    }

    private static boolean testFormatHeure(String str) {
        return str.matches("(0?[0-9]|1[0-2]):[0-5][0-9][AP]M");
    }

    private static void changeFormatHeure(String str) {
        final char[] HEURE12 = str.toCharArray();

        char[] heure24 = new char[5];

        //Différenciation de format HEURE12 'h:mmAM' ou 'hh:mmAM'
        int indexDoubleCot = 0;
        while (HEURE12[indexDoubleCot] != ':') {
            indexDoubleCot++;
        }

        // Remplissage de heure24 ':MM'
        for (int i = 0; i < 3; i++) {
            heure24[2 + i] = HEURE12[indexDoubleCot + i];
        }

        //Récupération du nombre d'heures dans HEURE12
        char[] heures12CHAR = new char[indexDoubleCot];
        for (int i = 0; i < indexDoubleCot; i++) {
            heures12CHAR[i] = HEURE12[i];
        }

        //Conversion de heures12CHAR en int
        int heures12INT = Integer.parseInt(String.copyValueOf(heures12CHAR));
        int heures24INT;
        boolean morning = (HEURE12[indexDoubleCot + 3] == 'A');
        if (heures12INT == 12) {
            heures24INT = morning ? 0 : 12;
        } else {
            heures24INT = morning ? heures12INT : heures12INT + 12;
        }

        heure24[0] = Character.forDigit((heures24INT / 10), 10);
        heure24[1] = Character.forDigit((heures24INT % 10), 10);

        System.out.println(String.copyValueOf(heure24));
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