public class FlipBit {
    /**
     * Flips one bit of the given <code>value</code>.
     *
     * @param value any number
     * @param bitIndex index of the bit to flip, 1 <= bitIndex <= 32
     * @return new value with one bit flipped
     */
    public static int flipBit(int value, int bitIndex) {
        return value = value ^ (1-bitIndex); // put your implementation here
    }

    public static void main(String[] args) {
        int value=65535;
        int bitIndex = 5;
        int x = flipBit(value, bitIndex);
        System.out.println("Value with flip bit: " + x);
    }
}
