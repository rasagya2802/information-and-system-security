import java.util.Scanner;
public class ModCalc {
    public static void calc(int a, int b, int m, int operation){
    
        switch(operation){
            case 1:
            System.out.println("Addition: " + ((a + b) % m));
            break;

            case 2:
            System.out.println("Subtraction: " + (a-b+m)%m );
            break;

            case 3:
            System.out.println("Multiplication: " + (a*b)%m);
            break;

            case 4:
            if(modInverse(a, m) == -1) System.out.println("No Inverse Exists");
            else System.out.println("Mod Inverse: " + modInverse(a, m));
            break;

            default:
            System.out.println("Invalid Operation");
            break;
        }

    }

    public static int modInverse(int a, int m){
        for(int i=0; i<m; i++){
            if((a*i)%m==1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");  
        System.out.println("3 - Multiplication");
        System.out.println("4 - Mod Inverse");


        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter modulus: ");
        int m = sc.nextInt();

        calc(a,b,m,choice);
sc.close();

    }
}
