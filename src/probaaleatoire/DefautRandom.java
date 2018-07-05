/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package probaaleatoire;

import java.util.Random;

/**
 *
 * @author Wout
 * @brief Generateur par défaut de JAVA, qui utilise la cngruence linéaire.
 */
public class DefautRandom extends Randomisateur{

    @Override
    public String getName() {
        return "Methode par défaut de JAVA";
    }

    @Override
    public int generer() {
        Random r = new Random();
        return r.nextInt();
    }
    
}
