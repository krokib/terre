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
        boolean morning = true;
        
        //indice de ':' pour traiter H:MM et HH:MM séparément
        int indexDoubleCot = 0;
        while (HEURE24[indexDoubleCot] != ':') {
            indexDoubleCot++;
        }
        
        //Remplissage de heure12 ':MM'
        for (int i = 0; i < 3; i++) {
            heure12[2 + i] = HEURE24[indexDoubleCot + i];
        }
        
        //Récupération des heures de HEURE24 dans un char[2]
        char[] heures24CHAR = new char[2];
        if (indexDoubleCot == 1) {
            heures24CHAR[0] = '0';
            heures24CHAR[1] = HEURE24[0];
        } else {
            for (int i = 0; i < 2; i++) {
                heures24CHAR[i] = HEURE24[i];
            }
        }

        //conversion des heures de HEURE24 en int
        int heures24INT = Integer.parseInt(String.copyValueOf(heures24CHAR));

        //Remplissage de heure12 'HH'
        if (heures24INT == 0) {
            //HEURE24 entre 00:00 et 00:59
            morning = true;
            heure12[0] = '1';
            heure12[1] = '2';
        } else if (heures24INT > 0 && heures24INT < 12) {
            //HEURE24 entre 1:00 et 11:59
            morning = true;
            heure12[0] = heures24CHAR[0];
            heure12[1] = heures24CHAR[1];
        } else if (heures24INT == 12) {
            //HEURE24 entre 12:00 et 12:59
            morning = false;
            heure12[0] = '1';
            heure12[1] = '2';
        } else {
            //HEURE24 entre 13:00 et 23:59
            morning = false;
            int heures12INT = heures24INT - 12;
            heure12[0] = Character.forDigit((heures12INT / 10), 10);
            heure12[1] = Character.forDigit((heures12INT % 10), 10);
        }

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