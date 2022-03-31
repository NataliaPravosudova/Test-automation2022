package task2;

public class Calc {
    public static void main(String[] args){

        double a=260.4;
        double b=195;
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println();
        System.out.println("a+b= "+add(a,b));
        System.out.println("a-b= "+minus(a,b));
        System.out.println("a*b= "+mult(a,b));
        System.out.println("a/b= "+divide(a,b));

    }

    private static double divide(double a, double b){
        return a/b;
    }

    private static double mult(double a, double b) {
        return a*b;
    }

    private static double minus(double a, double b){
        return a-b;
    }

    private static double add(double a, double b){
        return a+b;
    }
}
