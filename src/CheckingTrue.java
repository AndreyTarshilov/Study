public class CheckingTrue {
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        // return ((a==true)&&(b==true)&&(c==false)&&(d==false)) || ((a==true)&&(c==true)&&(b==false)&&(d==false)) ||((a==true)&&(d==true)&&(c==false)&&(b==false)) ||((b==true)&&(c==true)&&(a==false)&&(d==false)) ||((b==true)&&(d==true)&&(c==false)&&(a==false)) ||((c==true)&&(d==true)&&(a==false)&&(b==false));
        return ((a==true)&(b==true)&(c==false)&(d==false)) | ((a==true)&(c==true)&(b==false)&(d==false)) | ((a==true)&(d==true)&(c==false)&(b==false)) | ((b==true)&(c==true)&(a==false)&(d==false)) | ((b==true)&(d==true)&(c==false)&(a==false)) | ((c==true)&(d==true)&(a==false)&(b==false));
    }

    public static void main(String[] args) {
        boolean a1 = false;
        boolean b1 = true;
        boolean c1 = false;
        boolean d1 = true;
        boolean x = booleanExpression(a1, b1, c1, d1);
        System.out.println("Result x = " + x);
    }
}
