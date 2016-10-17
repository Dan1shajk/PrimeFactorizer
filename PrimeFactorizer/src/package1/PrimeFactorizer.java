package package1;

import java.util.ArrayList;

public class PrimeFactorizer {
	/**
	 * Initialize the object with target number n.
	 */
	private int targetNum;

	public PrimeFactorizer(int n) {
		targetNum = n;
	}

	/**
	 * Return n, the target number.
	 */
	public int getN() {
		// ...
		return 0;
	}

	/**
	 * Compute factorization. Do not repeat operation if it was called before.
	 */
	public void compute() {

	}

	/**
	 * Return the factors and exponents in two arraylists. Call compute() first,
	 * if necessary. For instance, if n=60, primes=[2,3,5], and
	 * exponents=[2,1,1].
	 */

	public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents) {

		for (int i = 2; n != 1; i++) {
			int num = 0;

			while (n % i == 0) {
				n = n / i;
				if (!primes.contains(i)) {
					primes.add(i);
					num++;
				} else {
					num++;
				}
			}
			if (num != 0) {
				exponents.add(num);
				
			}
		}
			System.out.println("Prime is " + primes);
			System.out.println("Exponents is " + exponents);
			
			for(int i = 0; i < primes.size(); i++)
			{
				int size = primes.size();
				
				if (exponents.get(i)== 1)
				{
					System.out.print(primes.get(i)+"*");
					if(size == i)
					{
						
					}
				}
				else
				{
					if (primes.size()-1 == i){
						System.out.print(primes.get(i)+"^"+exponents.get(i));
					}
					else 
					System.out.print(primes.get(i)+"^"+exponents.get(i)+"*");	
					//if(primes.size()-1 != i)
//					{System.out.print("*");}
				}	
				
			}
			//toString();
	}

	/**
	 * Return a string with the "pretty" representation of the prime
	 * factorization. For instance, if n is 60, then toString() for the
	 * PrimeFactorizer(60) object should be "60 = 2^2*3*5". Call compute() if
	 * not done before.
	 */
	public String toString() {

		System.out.println("hello");
		return "hi";
		
	}

	// ...... // other code, helper functions, etc.

}
