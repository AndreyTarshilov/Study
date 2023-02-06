public class DegreeOfTwo {
    public static boolean isPowerOfTwo(int value) {
        int c = Math.abs(value);
        if (((c & (c-1)) == 0) & (c != 0))
        return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(512));
    }
}
