/*
 *  Epreuve Terre - Nom du programme
 *  
 *  Créez un programme qui affiche son nom de fichier.
 *
 *  Exemples d’utilisation :
 *  $> node exo.js
 *  exo.js
 *
 *  $> node crevette.js
 *  crevette.js
 */

import java.io.File;

public class Terre01
 {
    public static void main(String[] args)
    {
        //System.out.println(System.getProperty("java.class.path"));
        //System.getProperties().list(System.out);
        File file = new File(System.getProperty("java.class.path"));
        String[] files = file.list();
        System.out.println(files[0]);
        System.out.println(files[1]);
        System.out.println(files[2]);
        System.out.println(files[3]);

        System.out.println("-------");

        System.out.println(Terre01.class.getName() + ".class");

        System.out.println("-------");

        System.out.println(Terre01.class.getClassLoader().getResource(".java"));

        //System.out.println(Terre01.class.getProtectionDomain().getCodeSource().getLocation());

    }
 }