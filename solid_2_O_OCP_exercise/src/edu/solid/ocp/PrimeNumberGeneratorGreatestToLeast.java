package edu.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGeneratorGreatestToLeast implements PrimeNumberGeneratorI {
    @Override
    public List<Integer> primes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = limit; i > 1; i--) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }
}
