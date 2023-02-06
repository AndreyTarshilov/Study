public class UnicodeAfter {
    public static char charExpression(int a) {

        int intFromCar = '\\';
        return(char)(intFromCar + a);
    }

    public static void main(String[] args) {
        int a1 = - 2;
        char x = charExpression(a1);
        System.out.println(x);
    }
}
