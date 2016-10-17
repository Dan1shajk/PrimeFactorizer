package package1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactorTest {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList();
		ArrayList<Integer> exponents = new ArrayList();
		Scanner scan = new Scanner(System.in);
	
		try{
			System.out.println("enter a number");
			num = scan.nextInt();
		}catch(InputMismatchException e){
			System.out.println("cant have doubles or strings");
		}
			
		
		
		PrimeFactorizer pf = new PrimeFactorizer(num);
		//pf.compute();
		pf.getFactorsAndExponents(num, primes, exponents);
		
	}
public static int num = 0;
}
