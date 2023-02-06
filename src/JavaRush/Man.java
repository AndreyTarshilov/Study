package JavaRush;

public class Man {
    private String noseSize;
    private String eyesColor;
    private String haircut;
    private boolean scars;
    private int dnaCode;

    public Man(String noseSize, String eyesColor, String haircut, boolean scars, int dnaCode) {
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.haircut = haircut;
        this.scars = scars;
        this.dnaCode = dnaCode;
    }
    /*public boolean equals (Object obj) {
        return (this == obj);}   */

    @Override
    public boolean equals(Object obj) {
        Man man = (Man) obj;
        return dnaCode == man.dnaCode;
    }

    @Override
    public int hashCode() {
        return dnaCode;
    }

    /*public static void main(String[] args) {
        Man man = new Man(String noseSize, String eyesColor, String haircut, boolean scars, int dnaCode);
    } */
}
