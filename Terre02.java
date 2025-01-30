/*
 * Epreuve Terre - Afficheur d'arguments
 * 
 * Créez un programme qui affiche les arguments qu’il reçoit ligne par ligne, peu importe le nombre d’arguments.
 * 
 * Exemples d’utilisation :
 * 
 * $> ruby exo.rb je suis solide !
 * je
 * suis
 * solide
 * !
 */

public class Terre02
{
    public static void main(String[] args)
    {
        if (args.length == 0) {
            System.out.println("Arguments manquants");
        } else {
            for (int i = 0; i < args.length; i++)
            {
                System.out.println(args[i]);
            }
        }
        
    }
}