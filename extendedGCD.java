public class extendedGCD{
    public static int extGCD(int a, int b, int[] x, int[] y){
        if(b==0){
            x[0]=1;
            y[0]=0;
            return a;
        }
        int[] x1 = new int[1];
        int[] y1 = new int[1];
        int gcd = extGCD(b,a%b,x1,y1);
        x[0] = y1[0];
        y[0] = x1[0] - (a/b)*y1[0];
        return gcd;

    }
    public static void main(String[] args){
        int a = 30;
        int b = 20;

        int[] x = new int[1];
        int[] y = new int[1];
        int gcd = extGCD(a,b,x,y);
        System.out.println("GCD: " + gcd);
    }
}

