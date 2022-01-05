package edu.solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberGenerator implements PrimeNumberGeneratorI {

	@Override
	public List<Integer> primes (int limit) {
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
}
