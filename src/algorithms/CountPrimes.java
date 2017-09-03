package algorithms;

public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public boolean isPrime(int num) {
        if (num == 1 || num == 0) return false;
        if (num == 2) return true;
        for (int i = 3; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        CountPrimes countPrimes = new CountPrimes();
        int c = countPrimes.countPrimes(100);
        System.out.println(c);
    }
}
