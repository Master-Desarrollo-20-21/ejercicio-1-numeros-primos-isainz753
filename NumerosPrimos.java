public class NumerosPrimos {

	public static void main(String[] args) {
        final int numMax = 50;

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
			if (isPrime(i)) {
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
			if (isPrime(i)) {
				//System.out.println("Es primo: " + i);
				contPrimes++;
				sumPrime += i;
			}
			i++;
		}
		return sumPrime;
    }
	

	/**
	 * Versión Inicial
	 * 
	 * @param num
	 * @return
	 */
    private static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;    
	}
	
	/**
	 * Versión Reducida
	 * 
	 * @param num
	 * @return
	 */
	private static boolean isPrimeReduce(int num) {
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;    
    }

}