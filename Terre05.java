/*
 * Epreuve Terre - Divisions
 * Créez un programme qui affiche le résultat et le reste d’une division entre
 * deux nombres.
 * 
 * Exemples d’utilisation :
 * $> python exo.py 5 2
 * résultat: 2
 * reste: 1
 * $> python exo.py 10 0
 * erreur.
 * $> python exo.py 3 5
 * erreur.
 */

 public class Terre05 {

    private static void messageErreur() {
        System.out.println("erreur.");
    }

    private static boolean testNombre(String nb) {
        return nb.matches("[+-]?[0-9]+");
    }

    private static void division(int a, int b) {
        if ((Math.abs(a) < Math.abs(b)) || (b == 0)) {
            messageErreur();
        } else {
            System.out.println("résultat: " + a / b);
            System.out.println("reste: " + a % b);
        }
    }
 
    public static void main(String[] args) {
        if (args.length != 2) {
            messageErreur();
        } else if (!testNombre(args[0]) || !testNombre(args[1])) {
            messageErreur();
        } else {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            division(a,b);
        }
    }
 }