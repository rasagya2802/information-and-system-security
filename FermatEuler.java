public class FermatEuler {
    static int power(int a, int p_n, int mod){
        int result = 1;
        for(int i=0; i<p_n; i++){
            result = (result * a) % mod; 
        }
        return result;
    }

    static int phi(int n){
        int result = n;
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                while(n%i==0){
                    n /= i;
                }
                result -= result/i;
            }
        }
        if (n>1) result -= result/n;
        return result;
    }

    static int Fermat(int a, int m){
        return power(a, m-2, m);
    }

    static int Euler(int a, int m){
        return power(a,phi(m)-1,m);
    }

    public static void main(String[] args) {
        int a = 3;
        int m1 = 7;   // Prime number
        int m2 = 10;  // Composite number but gcd(3, 10) = 1

        System.out.println("Inverse of " + a + " mod " + m1 + " using Fermat = " + Fermat(a, m1));
        System.out.println("Inverse of " + a + " mod " + m2 + " using Euler = " + Euler(a, m2));
    }
}
