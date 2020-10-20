public class NumerosPrimos {

	public static void main(String[] args) {
        int numMax = 50;

		System.out.println("La suma de los números primos que hay entre los 50 primeros números: "  + getSumPrime(numMax));
		System.out.println("La suma de los 50 primeros números primos: "  + getSumPrime50(numMax));
	}
	
	/**
	 * Suma de los números primos que hay entre los 50 primeros números
	 * 
	 * @param maxNum
	 * @return
	 */
	private static long getSumPrime(int maxNum) {
		long sumPrime = 0;
		for (int i = 2; i < maxNum; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				int rest = i % j;
				if (rest == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				//System.out.println("Es primo: " + i);
				sumPrime += i;
			}
		}
		return sumPrime;
		
	}
	
	/**
	 * Suma de los 50 primeros números primos
	 * 
	 * @param maxNum
	 * @return
	 */
	private static long getSumPrime50(int maxNum) {
		long sumPrime = 0;
		int i = 2;
		int contPrimes = 1;
		
		while (contPrimes <= maxNum) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				int rest = i % j;
				if (rest == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				//System.out.println("Es primo: " + i);
				contPrimes++;
				sumPrime += i;
			}
			i++;
		}
		return sumPrime;
	}

}