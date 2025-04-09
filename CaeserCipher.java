public class CaeserCipher {
    public static String encrypt(String text, int shift){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<text.length();i++){
            char ch = text.charAt(i);

            if(Character.isLowerCase(ch)){
                char c = (char) (((ch - 'a' + shift)% 26)+'a');
                result.append(c);
            } else {
                char c = (char) (((ch - 'A' + shift)%26)+'A');
                result.append(c);
            }
        }
        return result.toString();
    }
}
