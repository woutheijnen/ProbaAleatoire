/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package probaaleatoire;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Wout
 * @brief Methode de bonne qualité et rapide, mais pas assez pour la cryptographie
 * Utilise 2 generateurs XORShifts, 1 LCG et 1 generateur "multiply with carry".
 */
public class RecetteNumerique extends Randomisateur{
private Lock l = new ReentrantLock();
private long u;
private long v = 4101842887655102017L;
private long w = 1;

    @Override
    public String getName() {
        return "Recette numérique";
    }

    @Override
    public int generer() {
        long seed = System.nanoTime();
        l.lock();
        u = seed ^ v;
        nextLong();
        v = u;
        nextLong();
        w = v;
        nextLong();
        l.unlock();
        return next(32);
    }
    
public long nextLong() {
    l.lock();
    try {
      u = u * 2862933555777941757L + 7046029254386353087L;
      v ^= v >>> 17;
      v ^= v << 31;
      v ^= v >>> 8;
      w = 4294957665L * (w & 0xffffffff) + (w >>> 32);
      long x = u ^ (u << 21);
      x ^= x >>> 35;
      x ^= x << 4;
      long ret = (x + v) ^ w;
      return ret;
    } finally {
      l.unlock();
    }
  }
  
  protected int next(int bits) {
    return (int) (nextLong() >>> (64-bits));
  }
}
