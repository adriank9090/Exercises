package org.example;

import java.util.ArrayList;
import java.util.List;

public class IsPrimeNumber {

    public boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }

        }  return true;
    }


    public List<Integer> isScopePrime(int from, int to) {
        List<Integer> lista = new ArrayList<>();
        for (int i = from; i < to; i++) {
            if (isPrime(i)) {
                lista.add(i);
            }
        }
        return lista;
    }

}

