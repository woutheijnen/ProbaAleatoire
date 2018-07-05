/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package probaaleatoire;

import java.security.SecureRandom;
import java.util.Random;

/**
 *
 * @author Wout
 * @brief Très bonne qualité mais est 30 fois plus lent que le random par défaut de java.
 */
public class SecureRandomJava extends Randomisateur{

    @Override
    public String getName() {
        return "Security.SecureRandom";
    }

    @Override
    public int generer() {
        Random d = new SecureRandom();
        return d.nextInt();
    }
    
}
