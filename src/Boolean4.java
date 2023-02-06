public class Boolean4 {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        //return a & b & c & d;
        //return (a!=b) == (c!=d);
        //return (a && b) && (c && d);
        //return (a == b) && (c == d);
        return ((a & b) == true) |((a & c) == true) |((a & d) == true) |((b & c) == true) |((b & d) == true) |((c & d) == true);
    }

    public static void main(String[] args) {
        boolean a1 = true;
        boolean b1 = true;
        boolean c1 = true;
        boolean d1 = false;
        boolean x = Boolean4.booleanExpression(a1, b1, c1, d1);
        System.out.println(x);
    }
}
