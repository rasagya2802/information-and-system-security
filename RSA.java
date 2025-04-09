public class RSA {
    static int modInverse(int e, int phi){
        for(int d=1; d<phi; d++){
            if((e*d)%phi==1) return d;
        }
        return -1;
    }
    static int encrypt_decrypt(int m, int e, int n){
        int result = 1;
        for(int i=0; i<e; i++){
            result = (result * m) % n;
        }
        return result;
    }
    public static void main(String[] args){
        int p = 13;
        int q = 11;
        int n = p*q;
        int e = 7; 
        int phi = (p-1)*(q-1);
        int d = modInverse(e, phi);
        System.out.println("Public Key (n, e): (" + n + ", " + e + ")");
        System.out.println("Private Key (n, d): (" + n + ", " + d + ")");

        int message = 9;  // Plain Text

        int encrypted = encrypt_decrypt(message, e, n);
        System.out.println("Encrypted Message: " + encrypted);

        int decrypted = encrypt_decrypt(encrypted, d, n);
        System.out.println("Decrypted Message: " + decrypted);
    }
}

