/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package probaaleatoire;

/**
 *
 * @author Wout
 */
public class ProbaAleatoire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des randomisateurs
        DefautRandom rdef = new DefautRandom();
        XORShift r1 = new XORShift();
        RecetteNumerique r2 = new RecetteNumerique();
        SecureRandomJava r3 = new SecureRandomJava();
        
        System.out.println("==============================");
        System.out.println("Examples de différentes méthodes pour générer un nombre aléatoire:");
        
        //Generer et afficher les nombres aleatoires
        System.out.println(rdef.toString());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        
        //Examples de clé de cryptographie de haute qualité
        GenererCleCrypto g128 = new GenererCleCrypto(128);
        GenererCleCrypto g512 = new GenererCleCrypto(512);
        GenererCleCrypto g1024 = new GenererCleCrypto(1024);
        GenererCleCrypto g2048 = new GenererCleCrypto(2048);
        GenererCleCrypto g4096 = new GenererCleCrypto(4096);
        
        System.out.println();
        System.out.println();
        System.out.println("==============================");
        System.out.println("Examples de clés de cryptographie de haute qualité (en valeur HEX):");
        
        g128.generer();
        g512.generer();
        System.out.println();
        g1024.generer();
        System.out.println();
        g2048.generer();
        System.out.println();
        g4096.generer();
    }
    
}
