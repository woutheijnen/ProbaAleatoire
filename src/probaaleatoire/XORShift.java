/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package probaaleatoire;
/**
 *
 * @author Wout
 * @brief Methode extrèmement rapide, qualité medium
 */
public class XORShift extends Randomisateur{

    @Override
    public String getName() {
        return "XORShift";
    }

    @Override
    public int generer() {
        int x = (int) System.nanoTime();
        x ^= (x << 21);
        x ^= (x >>> 35);
        x ^= (x << 4);
  return x;
    }
}
