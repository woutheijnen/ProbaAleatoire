/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package probaaleatoire;

import java.security.SecureRandom;
import java.util.Random;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author Wout
 */
public class GenererCleCrypto{
    private int nbBit;
    
    public GenererCleCrypto(int bits)
    {
        nbBit = bits;
    }
    
    public String getName() {
        return "Example clé de Cryptographie";
    }
    
    public void generer() {
        Random ranGen = new SecureRandom();
        byte[] aesKey = new byte[nbBit/8]; // 16 bytes = 128 bits
        ranGen.nextBytes(aesKey);
        System.out.println("Voici un example d'un clé "+nbBit+"bit de haute qualité: "+DatatypeConverter.printHexBinary(aesKey));
    }
    
}
