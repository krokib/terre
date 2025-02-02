/*
 * Epreuve terre - Trié ou pas
 * 
 * Créez un programme qui détermine si une liste d’entiers est triée ou pas.
 * 
 * Exemples d’utilisation :
 * $> ruby exo.rb 9 8 3
 * Pas triée !
 * 
 * $> ruby exo.rb 3 8 9 12
 * Triée !
 * 
 * $> ruby exo.rb “Salut”
 * erreur.
 * 
 * Fonctions interdites:
 * -La fonction sort
 */

 public class Terre14 {
 
    private static boolean testArguments(String[] args) {
        boolean bonCardinal = (args.length > 1);
        boolean sontEntiers = true;
        for (int i = 0; i < args.length; i++) {
            sontEntiers &= args[i].matches("[0-9]+");
        }
        return bonCardinal && sontEntiers;
    }

    private static void trieOuPas(int[] entiers) {
        boolean estTrie = true;
        for (int i = 0; i < entiers.length - 1; i++) {
            estTrie &= (entiers[i] <= entiers[i + 1]);
        }
        System.out.println(estTrie ? "Triée !" : "Pas triée !");
    }

    public static void main(String[] args) {
        if (!testArguments(args)) {
            System.out.println("erreur.");
        } else {
            int[] entiers = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                entiers[i] = Integer.parseInt(args[i]);
            }
            trieOuPas(entiers);
        }
    }
 }