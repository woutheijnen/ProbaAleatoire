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
public abstract class Randomisateur {
    public abstract String getName();
    public abstract int generer();
    @Override
    public String toString()
    {
        return "La méthode: "+getName()+", a généré l'entier suivant: "+generer();
    }
}
