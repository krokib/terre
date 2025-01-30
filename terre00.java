/*
    Epreuve Terre - L'alphabet

    Créez un programme qui affiche l’alphabet en lettres minuscules suivi d’un retour à la ligne.


    Exemples d’utilisation :
    $> python exo.py
    abcdefghijklmnopqrstuvwxyz
    $>


    Attention : votre programme devra utiliser une boucle.

*/

class Terre00 
{
    public static void main(String[] args)
    {
        int ascii_a = (int) 'a';
        int ascii_z = ascii_a + 26 - 1;
        for (int i = ascii_a; i <= ascii_z; i++)
        {
            System.out.print((char) i);
        }
        System.out.println();
    }
}