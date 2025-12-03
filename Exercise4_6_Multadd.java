public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        
        return a * b + c;
    }

    public static double expSum(double x) {
     return multadd(x, Math.exp(x), Math.sqrt(1 + Math.exp(x)));
    }

    public static void main(String[] args) {
       //multadd test
        System.out.println("multad(2, 3, 4) = "+multadd(2, 3, 4));
       //expSum test
        double x = 0.5;
        System.out.println("expSum(" + x + ") = " +expSum(x));
                                                    
    }
}
