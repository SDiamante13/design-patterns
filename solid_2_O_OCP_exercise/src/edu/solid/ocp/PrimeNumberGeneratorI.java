package edu.solid.ocp;

import java.util.List;

public interface PrimeNumberGeneratorI {

    List<Integer> primes(int limit);

    default boolean isPrime(int candidate) {
       for (int i = 2; i < candidate; i++) {
           if (candidate % i == 0) {
               return false;
           }
       }

       return true;
   };
}
