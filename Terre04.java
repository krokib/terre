/*
 * Epreuve Terre - Pai ou impair
 * 
 * Créez un programme qui permet de déterminer si l’argument donné
 * est un entier pair ou impair..
 * 
 * Exemples d’utilisation :
 * $> ruby exo.rb 2
 * pair
 * 
 * $> ruby exo.rb 5
 * impair
 * 
 * $> ruby exo.rb Bonjour
 * Tu ne me la mettras pas à l’envers.
 * 
 * $> ruby exo.rb
 * Tu ne me la mettras pas à l’envers.
 * 
 * Attention : gérez aussi les entiers négatifs.
 * 
 * Fonctions interdites: 
 * -En Ruby: even? et odd?
 */

 public class Terre04 {
 
    private static void messageErreur () {
        System.out.println("Tu ne me la mettras pas à l'envers.");
    }

    private static void testPairImpair(int n) {
        System.out.println((n%2 == 0)?"pair":"impair");
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            messageErreur();
        } else if (!args[0].matches("[+-]?[0-9]+")) {
            messageErreur();
        } else {
            int nombre = Integer.parseInt(args[0]);
            testPairImpair(nombre);
        }
    } 
 }