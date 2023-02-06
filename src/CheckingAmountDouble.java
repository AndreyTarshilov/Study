public class CheckingAmountDouble {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
        // return a+b==c; // хотя здесь тоже работает
    }

    public static void main(String[] args) {
        double a1=-105987.4569;
        double b1=23458.5478;
        double c1 = -82528.9092;
        boolean x=doubleExpression(a1, b1, c1);
        System.out.println(x);
    }
}
