public class CaeserCipher {
    public static String encrypt(String text, int shift){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<text.length();i++){
            char ch = text.charAt(i);

            if(Character.isLowerCase(ch)){
                char c = (char) (((ch - 'a' + shift)% 26)+'a');
                result.append(c);
            } else if(Character.isUpperCase(ch)){ 
                char c = (char) (((ch - 'A' + shift)%26)+'A');
                result.append(c);
            } else{
                result.append(ch); // Non-alphabetic characters remain unchanged}
            }
        }
        return result.toString();
    }
     // Decrypt function
     public static String decrypt(String text, int shift) {
        return encrypt(text, 26 - shift); // Reverse shift
    }

    public static void main(String[] args) {

        String plainText = "Hello World";
        int key = 3;  // Shift of 3 positions

        System.out.println("Plain Text: " + plainText);
        String encrypted = encrypt(plainText, key);
        System.out.println("Encrypted Text: " + encrypted);
        String decrypted = decrypt(encrypted, key);
        System.out.println("Decrypted Text: " + decrypted);
    }
}
